// source: crescent/farming/v1beta1/proposal.proto
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

goog.provide('proto.crescent.farming.v1beta1.AddPlanRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.cosmos.base.v1beta1.DecCoin');
goog.require('proto.google.protobuf.Timestamp');

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
proto.crescent.farming.v1beta1.AddPlanRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.crescent.farming.v1beta1.AddPlanRequest.repeatedFields_, null);
};
goog.inherits(proto.crescent.farming.v1beta1.AddPlanRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.farming.v1beta1.AddPlanRequest.displayName = 'proto.crescent.farming.v1beta1.AddPlanRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.crescent.farming.v1beta1.AddPlanRequest.repeatedFields_ = [4,7];



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
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.farming.v1beta1.AddPlanRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.farming.v1beta1.AddPlanRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.AddPlanRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    farmingPoolAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    terminationAddress: jspb.Message.getFieldWithDefault(msg, 3, ""),
    stakingCoinWeightsList: jspb.Message.toObjectList(msg.getStakingCoinWeightsList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    endTime: (f = msg.getEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    epochAmountList: jspb.Message.toObjectList(msg.getEpochAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    epochRatio: jspb.Message.getFieldWithDefault(msg, 8, "")
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
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.farming.v1beta1.AddPlanRequest;
  return proto.crescent.farming.v1beta1.AddPlanRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.farming.v1beta1.AddPlanRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setFarmingPoolAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTerminationAddress(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addStakingCoinWeights(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndTime(value);
      break;
    case 7:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addEpochAmount(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setEpochRatio(value);
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
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.farming.v1beta1.AddPlanRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.farming.v1beta1.AddPlanRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.AddPlanRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFarmingPoolAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTerminationAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getStakingCoinWeightsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEndTime();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEpochAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getEpochRatio();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string farming_pool_address = 2;
 * @return {string}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getFarmingPoolAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setFarmingPoolAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string termination_address = 3;
 * @return {string}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getTerminationAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setTerminationAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin staking_coin_weights = 4;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getStakingCoinWeightsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 4));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
*/
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setStakingCoinWeightsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.addStakingCoinWeights = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.clearStakingCoinWeightsList = function() {
  return this.setStakingCoinWeightsList([]);
};


/**
 * optional google.protobuf.Timestamp start_time = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
*/
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional google.protobuf.Timestamp end_time = 6;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 6));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
*/
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.clearEndTime = function() {
  return this.setEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.hasEndTime = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * repeated cosmos.base.v1beta1.Coin epoch_amount = 7;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getEpochAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 7));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
*/
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setEpochAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.addEpochAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.clearEpochAmountList = function() {
  return this.setEpochAmountList([]);
};


/**
 * optional string epoch_ratio = 8;
 * @return {string}
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.getEpochRatio = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.AddPlanRequest} returns this
 */
proto.crescent.farming.v1beta1.AddPlanRequest.prototype.setEpochRatio = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


