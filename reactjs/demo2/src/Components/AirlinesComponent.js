import { useEffect, useState } from "react";
import AirlinesService from "../Services/AirlinesService";

const AirlinesComponent=()=>{
    const [airlines, setAirlines]=useState([]);

    useEffect(()=>{
        AirlinesService.getAllAirlines()
        .then((response)=>{
            console.log(response.data);
            setAirlines(response.data);
        })
        .catch((error)=>{
            alert(JSON.stringify(error))
        })
    },[]);

    return <div>
        <table className="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                <th>Name</th><th>Country</th>
                <th>Website</th><th>Logo</th>
                </tr>                
            </thead>
            <tbody>
                {
                    airlines.map(a=><tr>
                        <td>{a.name}</td>
                        <td>
                            {a.country  }
                        </td>
                        <td><a href={a.website}>{a.website}</a></td>
                        <td>
                            <img width={100} src={a.logo} alt={a.logo} />
                        </td>
                        </tr>)
                    
                }
            </tbody>
        </table>
    </div>
}
export default AirlinesComponent;