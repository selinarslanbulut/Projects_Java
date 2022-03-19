package Projects_Java.Day4.Homework3.business.abstracts;

import Projects_Java.Day4.Homework3.entities.concretes.Campaign;

public interface CampaignService {
    void addCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);

}
