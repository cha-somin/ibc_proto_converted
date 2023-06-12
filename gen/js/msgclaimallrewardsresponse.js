// source: provenance/reward/v1/tx.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.provenance.reward.v1.MsgClaimAllRewardsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.provenance.reward.v1.RewardProgramClaimDetail');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.reward.v1.MsgClaimAllRewardsResponse.repeatedFields_, null);
};
goog.inherits(proto.provenance.reward.v1.MsgClaimAllRewardsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.reward.v1.MsgClaimAllRewardsResponse.displayName = 'proto.provenance.reward.v1.MsgClaimAllRewardsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.repeatedFields_ = [1,2];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.reward.v1.MsgClaimAllRewardsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    totalRewardClaimList: jspb.Message.toObjectList(msg.getTotalRewardClaimList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    claimDetailsList: jspb.Message.toObjectList(msg.getClaimDetailsList(),
    proto.provenance.reward.v1.RewardProgramClaimDetail.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.reward.v1.MsgClaimAllRewardsResponse;
  return proto.provenance.reward.v1.MsgClaimAllRewardsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addTotalRewardClaim(value);
      break;
    case 2:
      var value = new proto.provenance.reward.v1.RewardProgramClaimDetail;
      reader.readMessage(value,proto.provenance.reward.v1.RewardProgramClaimDetail.deserializeBinaryFromReader);
      msg.addClaimDetails(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.reward.v1.MsgClaimAllRewardsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTotalRewardClaimList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getClaimDetailsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.provenance.reward.v1.RewardProgramClaimDetail.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin total_reward_claim = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.getTotalRewardClaimList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse} returns this
*/
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.setTotalRewardClaimList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.addTotalRewardClaim = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse} returns this
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.clearTotalRewardClaimList = function() {
  return this.setTotalRewardClaimList([]);
};


/**
 * repeated RewardProgramClaimDetail claim_details = 2;
 * @return {!Array<!proto.provenance.reward.v1.RewardProgramClaimDetail>}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.getClaimDetailsList = function() {
  return /** @type{!Array<!proto.provenance.reward.v1.RewardProgramClaimDetail>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.reward.v1.RewardProgramClaimDetail, 2));
};


/**
 * @param {!Array<!proto.provenance.reward.v1.RewardProgramClaimDetail>} value
 * @return {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse} returns this
*/
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.setClaimDetailsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.provenance.reward.v1.RewardProgramClaimDetail=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail}
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.addClaimDetails = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.provenance.reward.v1.RewardProgramClaimDetail, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.reward.v1.MsgClaimAllRewardsResponse} returns this
 */
proto.provenance.reward.v1.MsgClaimAllRewardsResponse.prototype.clearClaimDetailsList = function() {
  return this.setClaimDetailsList([]);
};


