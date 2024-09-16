function validatePassword()
{
    var password=document.getElementById("txtPassword").value;
    var cpassword=document.getElementById("txtCpassword").value;
    if(password!=cpassword)
    {
        //disable the signup button
        document.getElementById("btnSignup").disabled=true;
    }else
    document.getElementById("btnSignup").disabled=false;
}
function signup()
{
    var username=document.getElementById("txtUsername").value;
    var password=document.getElementById("txtPassword").value;
    var name=document.getElementById("txtName").value;
    var data=localStorage.getItem("users");
    if(data==null)
        data="";
    data+=username+","+password+","+name+";"

    localStorage.setItem("users",data);
    console.log("now, these many users are there:");
    console.log(data);
}

function login(){
    var username=document.getElementById("txtUsername").value;
    var password=document.getElementById("txtPassword").value;

    var data=localStorage.getItem("users");
    var users=data.split(";");
    var flag=false;
    for(var u of users)
    {
        var arr=u.split(",");
        var uname=arr[0];
        var pwd=arr[1];
        var name=arr[2];
        //check if the entered username and password matches
        if(username==uname && password==pwd)
        {
            flag=true;
            //found an user from localstorage matching 
            // alert(`Login successful, welcome ${name}`);
            //store current user in localStorage
            localStorage.setItem("user",username);
            //redirect to home page
            window.location.href="home.html";
            break;
        }
    }
    if(!flag)
    {
        document.getElementById("status").innerHTML="Login failed... Please try again";
    }
}

function fnCheck()
{
    // alert('fn chekc is called')
    //localStorage of user is there, then welcome
    //else, advise to login
    var user=localStorage.getItem("user");
    var h2=document.getElementById("h2");
    console.log(user)
    if(user==null || user=='')
    {
        h2.innerHTML="You have not logged in. Please login...";
    }else{
        h2.innerHTML=`Welcome, ${user}`;
    }
}

function fnLogout()
{
    localStorage.removeItem("user");
}