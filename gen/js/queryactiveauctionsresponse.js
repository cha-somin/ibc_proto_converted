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

goog.provide('proto.auction.v1.QueryActiveAuctionsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.auction.v1.Auction');

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
proto.auction.v1.QueryActiveAuctionsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.auction.v1.QueryActiveAuctionsResponse.repeatedFields_, null);
};
goog.inherits(proto.auction.v1.QueryActiveAuctionsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.auction.v1.QueryActiveAuctionsResponse.displayName = 'proto.auction.v1.QueryActiveAuctionsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.auction.v1.QueryActiveAuctionsResponse.repeatedFields_ = [1];



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
proto.auction.v1.QueryActiveAuctionsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.auction.v1.QueryActiveAuctionsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.auction.v1.QueryActiveAuctionsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.QueryActiveAuctionsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    auctionsList: jspb.Message.toObjectList(msg.getAuctionsList(),
    proto.auction.v1.Auction.toObject, includeInstance)
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
 * @return {!proto.auction.v1.QueryActiveAuctionsResponse}
 */
proto.auction.v1.QueryActiveAuctionsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.auction.v1.QueryActiveAuctionsResponse;
  return proto.auction.v1.QueryActiveAuctionsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.auction.v1.QueryActiveAuctionsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.auction.v1.QueryActiveAuctionsResponse}
 */
proto.auction.v1.QueryActiveAuctionsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.auction.v1.Auction;
      reader.readMessage(value,proto.auction.v1.Auction.deserializeBinaryFromReader);
      msg.addAuctions(value);
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
proto.auction.v1.QueryActiveAuctionsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.auction.v1.QueryActiveAuctionsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.auction.v1.QueryActiveAuctionsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.QueryActiveAuctionsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuctionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.auction.v1.Auction.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Auction auctions = 1;
 * @return {!Array<!proto.auction.v1.Auction>}
 */
proto.auction.v1.QueryActiveAuctionsResponse.prototype.getAuctionsList = function() {
  return /** @type{!Array<!proto.auction.v1.Auction>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.auction.v1.Auction, 1));
};


/**
 * @param {!Array<!proto.auction.v1.Auction>} value
 * @return {!proto.auction.v1.QueryActiveAuctionsResponse} returns this
*/
proto.auction.v1.QueryActiveAuctionsResponse.prototype.setAuctionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.auction.v1.Auction=} opt_value
 * @param {number=} opt_index
 * @return {!proto.auction.v1.Auction}
 */
proto.auction.v1.QueryActiveAuctionsResponse.prototype.addAuctions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.auction.v1.Auction, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.auction.v1.QueryActiveAuctionsResponse} returns this
 */
proto.auction.v1.QueryActiveAuctionsResponse.prototype.clearAuctionsList = function() {
  return this.setAuctionsList([]);
};

