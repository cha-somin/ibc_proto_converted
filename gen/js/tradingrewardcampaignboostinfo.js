// source: injective/exchange/v1beta1/exchange.proto
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

goog.provide('proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.PointsMultiplier');

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
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.displayName = 'proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.repeatedFields_ = [1,2,3,4];



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
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    boostedSpotMarketIdsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    spotMarketMultipliersList: jspb.Message.toObjectList(msg.getSpotMarketMultipliersList(),
    proto.injective.exchange.v1beta1.PointsMultiplier.toObject, includeInstance),
    boostedDerivativeMarketIdsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    derivativeMarketMultipliersList: jspb.Message.toObjectList(msg.getDerivativeMarketMultipliersList(),
    proto.injective.exchange.v1beta1.PointsMultiplier.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo;
  return proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addBoostedSpotMarketIds(value);
      break;
    case 2:
      var value = new proto.injective.exchange.v1beta1.PointsMultiplier;
      reader.readMessage(value,proto.injective.exchange.v1beta1.PointsMultiplier.deserializeBinaryFromReader);
      msg.addSpotMarketMultipliers(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addBoostedDerivativeMarketIds(value);
      break;
    case 4:
      var value = new proto.injective.exchange.v1beta1.PointsMultiplier;
      reader.readMessage(value,proto.injective.exchange.v1beta1.PointsMultiplier.deserializeBinaryFromReader);
      msg.addDerivativeMarketMultipliers(value);
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
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBoostedSpotMarketIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getSpotMarketMultipliersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.injective.exchange.v1beta1.PointsMultiplier.serializeBinaryToWriter
    );
  }
  f = message.getBoostedDerivativeMarketIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getDerivativeMarketMultipliersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.injective.exchange.v1beta1.PointsMultiplier.serializeBinaryToWriter
    );
  }
};


/**
 * repeated string boosted_spot_market_ids = 1;
 * @return {!Array<string>}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.getBoostedSpotMarketIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.setBoostedSpotMarketIdsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.addBoostedSpotMarketIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.clearBoostedSpotMarketIdsList = function() {
  return this.setBoostedSpotMarketIdsList([]);
};


/**
 * repeated PointsMultiplier spot_market_multipliers = 2;
 * @return {!Array<!proto.injective.exchange.v1beta1.PointsMultiplier>}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.getSpotMarketMultipliersList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.PointsMultiplier>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.PointsMultiplier, 2));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.PointsMultiplier>} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
*/
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.setSpotMarketMultipliersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.PointsMultiplier=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.PointsMultiplier}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.addSpotMarketMultipliers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.injective.exchange.v1beta1.PointsMultiplier, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.clearSpotMarketMultipliersList = function() {
  return this.setSpotMarketMultipliersList([]);
};


/**
 * repeated string boosted_derivative_market_ids = 3;
 * @return {!Array<string>}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.getBoostedDerivativeMarketIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.setBoostedDerivativeMarketIdsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.addBoostedDerivativeMarketIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.clearBoostedDerivativeMarketIdsList = function() {
  return this.setBoostedDerivativeMarketIdsList([]);
};


/**
 * repeated PointsMultiplier derivative_market_multipliers = 4;
 * @return {!Array<!proto.injective.exchange.v1beta1.PointsMultiplier>}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.getDerivativeMarketMultipliersList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.PointsMultiplier>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.PointsMultiplier, 4));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.PointsMultiplier>} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
*/
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.setDerivativeMarketMultipliersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.PointsMultiplier=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.PointsMultiplier}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.addDerivativeMarketMultipliers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.injective.exchange.v1beta1.PointsMultiplier, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.prototype.clearDerivativeMarketMultipliersList = function() {
  return this.setDerivativeMarketMultipliersList([]);
};


