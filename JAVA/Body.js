import RestaurantCards from "./ResturantCars";
import { Reslist } from "./Resturant_Data";
const Body = () =>{
    return(
        <div>
            {Reslist.map((restaurant) =>(
                <RestaurantCards key={restaurant.info.id} resdata={restaurant} />
            ))}
        </div>
        
    );
};

export default Body;