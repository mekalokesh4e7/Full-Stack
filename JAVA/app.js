import React from "react";
import ReactDOM from "react-dom/client";
import Header from "./Header";
import Body from "./Body";
import Footer from "./Footer";


//var hOneElement = React.createElement("h1",{},"this is my project");
var root = ReactDOM.createRoot(document.getElementById("root"));

const Approot = () =>{
    return(
        <>
            <Header />
            <Body />
            <Footer />
        </>
    )
};






root.render(<Approot />);