package Projects_Java.Day4.Homework3.business.concretes;

import Projects_Java.Day4.Homework3.business.abstracts.CampaignService;
import Projects_Java.Day4.Homework3.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ "Kampanyası Eklenmiştir.");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ "Kampanyası Güncellenmiştir.");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ "Kampanyası Silinmiştir.");
    }
}
