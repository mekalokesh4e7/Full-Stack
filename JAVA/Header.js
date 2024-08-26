import { Logo_Img } from "./Contents";
import Nav_items from "./Nav_Items";

const Header = () =>{
    return(
        <div className="header_Body">
            <img src={Logo_Img}></img>
            <Nav_items />
        </div>
    );
};

export default Header;