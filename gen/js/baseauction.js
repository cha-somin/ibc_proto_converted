// source: kava/auction/v1beta1/auction.proto
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

goog.provide('proto.kava.auction.v1beta1.BaseAuction');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
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
proto.kava.auction.v1beta1.BaseAuction = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.auction.v1beta1.BaseAuction, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.auction.v1beta1.BaseAuction.displayName = 'proto.kava.auction.v1beta1.BaseAuction';
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
proto.kava.auction.v1beta1.BaseAuction.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.auction.v1beta1.BaseAuction.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.auction.v1beta1.BaseAuction} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.BaseAuction.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    initiator: jspb.Message.getFieldWithDefault(msg, 2, ""),
    lot: (f = msg.getLot()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    bidder: msg.getBidder_asB64(),
    bid: (f = msg.getBid()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    hasReceivedBids: jspb.Message.getBooleanFieldWithDefault(msg, 6, false),
    endTime: (f = msg.getEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    maxEndTime: (f = msg.getMaxEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.kava.auction.v1beta1.BaseAuction}
 */
proto.kava.auction.v1beta1.BaseAuction.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.auction.v1beta1.BaseAuction;
  return proto.kava.auction.v1beta1.BaseAuction.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.auction.v1beta1.BaseAuction} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.auction.v1beta1.BaseAuction}
 */
proto.kava.auction.v1beta1.BaseAuction.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setInitiator(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setLot(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setBidder(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setBid(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setHasReceivedBids(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndTime(value);
      break;
    case 8:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setMaxEndTime(value);
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
proto.kava.auction.v1beta1.BaseAuction.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.auction.v1beta1.BaseAuction.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.auction.v1beta1.BaseAuction} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.BaseAuction.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getInitiator();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getLot();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getBidder_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getBid();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getHasReceivedBids();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
  f = message.getEndTime();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getMaxEndTime();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string initiator = 2;
 * @return {string}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getInitiator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.setInitiator = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin lot = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getLot = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
*/
proto.kava.auction.v1beta1.BaseAuction.prototype.setLot = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.clearLot = function() {
  return this.setLot(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.hasLot = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bytes bidder = 4;
 * @return {string}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getBidder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes bidder = 4;
 * This is a type-conversion wrapper around `getBidder()`
 * @return {string}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getBidder_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getBidder()));
};


/**
 * optional bytes bidder = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getBidder()`
 * @return {!Uint8Array}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getBidder_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getBidder()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.setBidder = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional cosmos.base.v1beta1.Coin bid = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getBid = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
*/
proto.kava.auction.v1beta1.BaseAuction.prototype.setBid = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.clearBid = function() {
  return this.setBid(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.hasBid = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional bool has_received_bids = 6;
 * @return {boolean}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getHasReceivedBids = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.setHasReceivedBids = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


/**
 * optional google.protobuf.Timestamp end_time = 7;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 7));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
*/
proto.kava.auction.v1beta1.BaseAuction.prototype.setEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.clearEndTime = function() {
  return this.setEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.hasEndTime = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional google.protobuf.Timestamp max_end_time = 8;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.getMaxEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 8));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
*/
proto.kava.auction.v1beta1.BaseAuction.prototype.setMaxEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.BaseAuction} returns this
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.clearMaxEndTime = function() {
  return this.setMaxEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.BaseAuction.prototype.hasMaxEndTime = function() {
  return jspb.Message.getField(this, 8) != null;
};


