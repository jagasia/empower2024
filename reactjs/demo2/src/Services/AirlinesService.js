import axios from "axios";

class AirlinesService
{
    URL="https://api.instantwebtools.net/v1/airlines"

    getAllAirlines()
    {
        return axios.get(this.URL);
    }

    findAirlinesById(id)
    {
        return axios.get(this.URL+`/${id}`);
    }
}
export default new AirlinesService();