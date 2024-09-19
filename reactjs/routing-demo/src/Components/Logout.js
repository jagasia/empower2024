import React from 'react'

const Logout = () => {
  localStorage.removeItem("user")
  return (
    <div>Logout</div>
  )
}

export default Logout