package com.generali;

import com.ibm.replication.cdc.scripting.*;
// import java.text.MessageFormat;

public class endReplication {
   public static void main(String[] args) {
      System.out.println("Program inside");
      EmbeddedScript script = new EmbeddedScript();

      try {
         script.open();

         script.execute("connect server 10.60.1.19 username Admin password abcd1234");
         script.execute("connect datastore name as400 context source");
         script.execute("connect datastore name HDVTSTDTA_DS context target");

         script.execute("select subscription name HDVTSTDTA");
         script.execute("end replication");

         script.execute("disconnect datastore name as400");
         script.execute("disconnect datastore name HDVTSTDTA_DS");

         script.execute("disconnect server");

         // script.execute(â add subscription name SUB1â );

         // String mapping = â add table mappingâ
         // + â sourceSchema {0} sourceTable {1}â
         // + â targetSchema {2} targetTable {3}â ;

         // script.execute(MessageFormat.format(mapping, new Object[] {
      } catch (EmbeddedScriptException e) {
         System.out.println(e.getResultCodeAndMessage());
      } finally {
         script.close();
      }
   }
}
