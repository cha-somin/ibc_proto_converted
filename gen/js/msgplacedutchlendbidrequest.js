// source: comdex/auction/v1beta1/tx.proto
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

goog.provide('proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.displayName = 'proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest';
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
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    auctionId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    bidder: jspb.Message.getFieldWithDefault(msg, 2, ""),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    appId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    auctionMappingId: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest;
  return proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAuctionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBidder(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAuctionMappingId(value);
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
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuctionId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getBidder();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getAuctionMappingId();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * optional uint64 auction_id = 1;
 * @return {number}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.getAuctionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} returns this
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.setAuctionId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string bidder = 2;
 * @return {string}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.getBidder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} returns this
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.setBidder = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} returns this
*/
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} returns this
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional uint64 app_id = 4;
 * @return {number}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} returns this
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 auction_mapping_id = 5;
 * @return {number}
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.getAuctionMappingId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest} returns this
 */
proto.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.prototype.setAuctionMappingId = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


