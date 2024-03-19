// source: cosmos/distribution/v1beta1/query.proto
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

goog.provide('proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');
goog.require('proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward');

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
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.displayName = 'proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.repeatedFields_ = [1,2];



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
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    rewardsList: jspb.Message.toObjectList(msg.getRewardsList(),
    proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward.toObject, includeInstance),
    totalList: jspb.Message.toObjectList(msg.getTotalList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance)
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
 * @return {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse}
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse;
  return proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse}
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward.deserializeBinaryFromReader);
      msg.addRewards(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addTotal(value);
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
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRewardsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward.serializeBinaryToWriter
    );
  }
  f = message.getTotalList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
};


/**
 * repeated TokenizeShareRecordReward rewards = 1;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward>}
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.getRewardsList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward, 1));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward>} value
 * @return {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse} returns this
*/
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.setRewardsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward}
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.addRewards = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.distribution.v1beta1.TokenizeShareRecordReward, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse} returns this
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.clearRewardsList = function() {
  return this.setRewardsList([]);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin total = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.getTotalList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse} returns this
*/
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.setTotalList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.addTotal = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse} returns this
 */
proto.cosmos.distribution.v1beta1.QueryTokenizeShareRecordRewardResponse.prototype.clearTotalList = function() {
  return this.setTotalList([]);
};


