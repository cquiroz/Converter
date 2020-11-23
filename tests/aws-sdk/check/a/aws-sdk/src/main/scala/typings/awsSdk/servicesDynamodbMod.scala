package typings.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk.dynamodbMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesDynamodbMod {
  
  @JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
  @js.native
  class DynamoDBCustomizations () extends js.Object
  /* static members */
  object DynamoDBCustomizations {
    
    @JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The document client simplifies working with items in Amazon DynamoDB by abstracting away the notion of attribute values.
      * This abstraction annotates native JavaScript types supplied as input parameters, as well as converts annotated response data to native JavaScript types.
      */
    @JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations.DocumentClient")
    @js.native
    val DocumentClient: Instantiable1[
        /* options */ scala.Unit | (DocumentClientOptions & ClientConfiguration), 
        typings.awsSdk.documentClientMod.DocumentClient
      ] = js.native
    @scala.inline
    def DocumentClient_=(
      x: Instantiable1[
          /* options */ scala.Unit | (DocumentClientOptions & ClientConfiguration), 
          typings.awsSdk.documentClientMod.DocumentClient
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DocumentClient")(x.asInstanceOf[js.Any])
  }
}
