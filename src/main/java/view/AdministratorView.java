package view;

import java.util.List;

public interface AdministratorView {
   void downloadTrainingList(String GUID);

   void uploadTrainingList(String GUID, List<String> subjects);
}
