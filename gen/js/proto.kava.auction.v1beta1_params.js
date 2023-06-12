// source: kava/auction/v1beta1/genesis.proto
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

goog.provide('proto.kava.auction.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');

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
proto.kava.auction.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.auction.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.auction.v1beta1.Params.displayName = 'proto.kava.auction.v1beta1.Params';
}



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
proto.kava.auction.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.auction.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.auction.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    maxAuctionDuration: (f = msg.getMaxAuctionDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    forwardBidDuration: (f = msg.getForwardBidDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    reverseBidDuration: (f = msg.getReverseBidDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    incrementSurplus: msg.getIncrementSurplus_asB64(),
    incrementDebt: msg.getIncrementDebt_asB64(),
    incrementCollateral: msg.getIncrementCollateral_asB64()
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
 * @return {!proto.kava.auction.v1beta1.Params}
 */
proto.kava.auction.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.auction.v1beta1.Params;
  return proto.kava.auction.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.auction.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.auction.v1beta1.Params}
 */
proto.kava.auction.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setMaxAuctionDuration(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setForwardBidDuration(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setReverseBidDuration(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setIncrementSurplus(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setIncrementDebt(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setIncrementCollateral(value);
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
proto.kava.auction.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.auction.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.auction.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMaxAuctionDuration();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getForwardBidDuration();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getReverseBidDuration();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getIncrementSurplus_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getIncrementDebt_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getIncrementCollateral_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
};


/**
 * optional google.protobuf.Duration max_auction_duration = 1;
 * @return {?proto.google.protobuf.Duration}
 */
proto.kava.auction.v1beta1.Params.prototype.getMaxAuctionDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 1));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.kava.auction.v1beta1.Params} returns this
*/
proto.kava.auction.v1beta1.Params.prototype.setMaxAuctionDuration = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.Params} returns this
 */
proto.kava.auction.v1beta1.Params.prototype.clearMaxAuctionDuration = function() {
  return this.setMaxAuctionDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.Params.prototype.hasMaxAuctionDuration = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional google.protobuf.Duration forward_bid_duration = 6;
 * @return {?proto.google.protobuf.Duration}
 */
proto.kava.auction.v1beta1.Params.prototype.getForwardBidDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 6));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.kava.auction.v1beta1.Params} returns this
*/
proto.kava.auction.v1beta1.Params.prototype.setForwardBidDuration = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.Params} returns this
 */
proto.kava.auction.v1beta1.Params.prototype.clearForwardBidDuration = function() {
  return this.setForwardBidDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.Params.prototype.hasForwardBidDuration = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional google.protobuf.Duration reverse_bid_duration = 7;
 * @return {?proto.google.protobuf.Duration}
 */
proto.kava.auction.v1beta1.Params.prototype.getReverseBidDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 7));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.kava.auction.v1beta1.Params} returns this
*/
proto.kava.auction.v1beta1.Params.prototype.setReverseBidDuration = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.Params} returns this
 */
proto.kava.auction.v1beta1.Params.prototype.clearReverseBidDuration = function() {
  return this.setReverseBidDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.Params.prototype.hasReverseBidDuration = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional bytes increment_surplus = 3;
 * @return {string}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementSurplus = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes increment_surplus = 3;
 * This is a type-conversion wrapper around `getIncrementSurplus()`
 * @return {string}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementSurplus_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getIncrementSurplus()));
};


/**
 * optional bytes increment_surplus = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getIncrementSurplus()`
 * @return {!Uint8Array}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementSurplus_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getIncrementSurplus()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.auction.v1beta1.Params} returns this
 */
proto.kava.auction.v1beta1.Params.prototype.setIncrementSurplus = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional bytes increment_debt = 4;
 * @return {string}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementDebt = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes increment_debt = 4;
 * This is a type-conversion wrapper around `getIncrementDebt()`
 * @return {string}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementDebt_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getIncrementDebt()));
};


/**
 * optional bytes increment_debt = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getIncrementDebt()`
 * @return {!Uint8Array}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementDebt_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getIncrementDebt()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.auction.v1beta1.Params} returns this
 */
proto.kava.auction.v1beta1.Params.prototype.setIncrementDebt = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional bytes increment_collateral = 5;
 * @return {string}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementCollateral = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes increment_collateral = 5;
 * This is a type-conversion wrapper around `getIncrementCollateral()`
 * @return {string}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementCollateral_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getIncrementCollateral()));
};


/**
 * optional bytes increment_collateral = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getIncrementCollateral()`
 * @return {!Uint8Array}
 */
proto.kava.auction.v1beta1.Params.prototype.getIncrementCollateral_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getIncrementCollateral()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.auction.v1beta1.Params} returns this
 */
proto.kava.auction.v1beta1.Params.prototype.setIncrementCollateral = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


