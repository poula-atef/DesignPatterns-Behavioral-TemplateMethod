# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Template Method Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي اكتر من class بيعملو عمليه معينه بنفس ترتيب الخطوات لكن في اختلاف بسيط في الخطوات نفسها .. عشان كده بنعمل parent abstract class بيبقي فيه العمليه المشتركه
و بيقسم العمليه المشتركه الي مجموعة methods كل واحده هي عباره عن خطوه .. و اخيرا بيكون في method فيها ال calling بتاع ال methods دول مترتبين بالترتيب المطلوب و عشان كده بيتقال عليها template method ..
و ال classes اللي بيقومو بالعمليه دي بيعملو extend منها و لو عايزين يغيرو في خطوه معينه يعملو override لل method بتاعت الخطوه دي و يحطو ال implementation المطلوب لكن ترتيب الخطوات بيظل ثابت بناء علي ال template method
اللي متعرفه عند ال parent.
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال Test Abstract Class و ده فيه ال template method و ال methods الخاصه بال steps اللي المفروض تكون في اي class بيعمل extend لل class ده
  - ال TrueFalseTest Class و ده بيعمل extend لل Test Class
  - ال MultipleChoicesTest Class و ده بيعمل extend لل Test Class
