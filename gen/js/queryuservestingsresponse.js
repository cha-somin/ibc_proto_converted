// source: stride/claim/query.proto
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

goog.provide('proto.stride.claim.QueryUserVestingsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.stride.vesting.Period');

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
proto.stride.claim.QueryUserVestingsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stride.claim.QueryUserVestingsResponse.repeatedFields_, null);
};
goog.inherits(proto.stride.claim.QueryUserVestingsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.claim.QueryUserVestingsResponse.displayName = 'proto.stride.claim.QueryUserVestingsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stride.claim.QueryUserVestingsResponse.repeatedFields_ = [3,1];



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
proto.stride.claim.QueryUserVestingsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.claim.QueryUserVestingsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.claim.QueryUserVestingsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.claim.QueryUserVestingsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    spendableCoinsList: jspb.Message.toObjectList(msg.getSpendableCoinsList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    periodsList: jspb.Message.toObjectList(msg.getPeriodsList(),
    proto.stride.vesting.Period.toObject, includeInstance)
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
 * @return {!proto.stride.claim.QueryUserVestingsResponse}
 */
proto.stride.claim.QueryUserVestingsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.claim.QueryUserVestingsResponse;
  return proto.stride.claim.QueryUserVestingsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.claim.QueryUserVestingsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.claim.QueryUserVestingsResponse}
 */
proto.stride.claim.QueryUserVestingsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addSpendableCoins(value);
      break;
    case 1:
      var value = new proto.stride.vesting.Period;
      reader.readMessage(value,proto.stride.vesting.Period.deserializeBinaryFromReader);
      msg.addPeriods(value);
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
proto.stride.claim.QueryUserVestingsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.claim.QueryUserVestingsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.claim.QueryUserVestingsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.claim.QueryUserVestingsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSpendableCoinsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getPeriodsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.stride.vesting.Period.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin spendable_coins = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.stride.claim.QueryUserVestingsResponse.prototype.getSpendableCoinsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.stride.claim.QueryUserVestingsResponse} returns this
*/
proto.stride.claim.QueryUserVestingsResponse.prototype.setSpendableCoinsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.stride.claim.QueryUserVestingsResponse.prototype.addSpendableCoins = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.claim.QueryUserVestingsResponse} returns this
 */
proto.stride.claim.QueryUserVestingsResponse.prototype.clearSpendableCoinsList = function() {
  return this.setSpendableCoinsList([]);
};


/**
 * repeated stride.vesting.Period periods = 1;
 * @return {!Array<!proto.stride.vesting.Period>}
 */
proto.stride.claim.QueryUserVestingsResponse.prototype.getPeriodsList = function() {
  return /** @type{!Array<!proto.stride.vesting.Period>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stride.vesting.Period, 1));
};


/**
 * @param {!Array<!proto.stride.vesting.Period>} value
 * @return {!proto.stride.claim.QueryUserVestingsResponse} returns this
*/
proto.stride.claim.QueryUserVestingsResponse.prototype.setPeriodsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.stride.vesting.Period=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stride.vesting.Period}
 */
proto.stride.claim.QueryUserVestingsResponse.prototype.addPeriods = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.stride.vesting.Period, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.claim.QueryUserVestingsResponse} returns this
 */
proto.stride.claim.QueryUserVestingsResponse.prototype.clearPeriodsList = function() {
  return this.setPeriodsList([]);
};


