// source: sommelier/auction/v1/query.proto
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

goog.provide('proto.auction.v1.QueryBidResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.auction.v1.Bid');

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
proto.auction.v1.QueryBidResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.auction.v1.QueryBidResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.auction.v1.QueryBidResponse.displayName = 'proto.auction.v1.QueryBidResponse';
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
proto.auction.v1.QueryBidResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.auction.v1.QueryBidResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.auction.v1.QueryBidResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.QueryBidResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    bid: (f = msg.getBid()) && proto.auction.v1.Bid.toObject(includeInstance, f)
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
 * @return {!proto.auction.v1.QueryBidResponse}
 */
proto.auction.v1.QueryBidResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.auction.v1.QueryBidResponse;
  return proto.auction.v1.QueryBidResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.auction.v1.QueryBidResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.auction.v1.QueryBidResponse}
 */
proto.auction.v1.QueryBidResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.auction.v1.Bid;
      reader.readMessage(value,proto.auction.v1.Bid.deserializeBinaryFromReader);
      msg.setBid(value);
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
proto.auction.v1.QueryBidResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.auction.v1.QueryBidResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.auction.v1.QueryBidResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.QueryBidResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBid();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.auction.v1.Bid.serializeBinaryToWriter
    );
  }
};


/**
 * optional Bid bid = 1;
 * @return {?proto.auction.v1.Bid}
 */
proto.auction.v1.QueryBidResponse.prototype.getBid = function() {
  return /** @type{?proto.auction.v1.Bid} */ (
    jspb.Message.getWrapperField(this, proto.auction.v1.Bid, 1));
};


/**
 * @param {?proto.auction.v1.Bid|undefined} value
 * @return {!proto.auction.v1.QueryBidResponse} returns this
*/
proto.auction.v1.QueryBidResponse.prototype.setBid = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.auction.v1.QueryBidResponse} returns this
 */
proto.auction.v1.QueryBidResponse.prototype.clearBid = function() {
  return this.setBid(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.auction.v1.QueryBidResponse.prototype.hasBid = function() {
  return jspb.Message.getField(this, 1) != null;
};


