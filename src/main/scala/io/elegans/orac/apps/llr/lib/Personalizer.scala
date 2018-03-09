package io.elegans.orac.apps.llr.lib

import org.apache.spark.rdd.RDD

class Personalizer {


  /**
    *
    * @return RDD[Array(userId, aggregatedRankId, itemId)]
    */
  def getInteractions(): RDD[Array[String]] {

  }

  /**
    * @param interactions: first element is user id, second element is item's aggregatedRankId
    * @return RDD[Array(userId, Array(recommendedItemIds))]
    */
  def llrRecommendations(interactions:RDD[Array[String]]): RDD[Array[String]] = {


    ...

  }





}