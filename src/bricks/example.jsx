import React, { useState } from "react";
import ReactDOM from "react-dom/client";

function TestTestTest(){

    //HIER KANNST DU ETWAIGEN JAVASCRIPT SCHREIBEN, zB FETCHES UND SO, ALLES WAS NACHHER AUF DER SEITE STEHEN SOLL MUSS NACH DEM 
    //RETURN STEHEN. EXPORT/IMPORT NICHT VERGESSEN

    const [hookExample, setHookExample] = useState("UND IHNEN DABEI AUF DEN FUSS TIPPE")

    return (
    <div>
    
    <label htmlFor="input1">ALSO WENN ICH SAGE "HALLO MR. THOMPSON </label>
    <h3> {hookExample} </h3>

  
    <button onClick={() => setHookExample("NICKEN SIE UND LÄCHELN, OKAY?!?!")}> DANN</button>

    
    <h1> HALLO MR. THOMPSON</h1>
    
    
    <button type="button"> Ich glaube er meint Sie!!</button>
    </div>
    );
    
}

export default TestTestTest;