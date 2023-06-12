// source: comdex/auction/v1beta1/query.proto
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

goog.provide('proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.auction.v1beta1.DutchBiddings');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');

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
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.repeatedFields_, null);
};
goog.inherits(proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.displayName = 'proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.repeatedFields_ = [2];



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
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    bidder: jspb.Message.getFieldWithDefault(msg, 1, ""),
    biddingsList: jspb.Message.toObjectList(msg.getBiddingsList(),
    proto.comdex.auction.v1beta1.DutchBiddings.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse}
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse;
  return proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse}
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBidder(value);
      break;
    case 2:
      var value = new proto.comdex.auction.v1beta1.DutchBiddings;
      reader.readMessage(value,proto.comdex.auction.v1beta1.DutchBiddings.deserializeBinaryFromReader);
      msg.addBiddings(value);
      break;
    case 3:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBidder();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBiddingsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.comdex.auction.v1beta1.DutchBiddings.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional string bidder = 1;
 * @return {string}
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.getBidder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} returns this
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.setBidder = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated DutchBiddings biddings = 2;
 * @return {!Array<!proto.comdex.auction.v1beta1.DutchBiddings>}
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.getBiddingsList = function() {
  return /** @type{!Array<!proto.comdex.auction.v1beta1.DutchBiddings>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.auction.v1beta1.DutchBiddings, 2));
};


/**
 * @param {!Array<!proto.comdex.auction.v1beta1.DutchBiddings>} value
 * @return {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} returns this
*/
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.setBiddingsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.comdex.auction.v1beta1.DutchBiddings=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.auction.v1beta1.DutchBiddings}
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.addBiddings = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.comdex.auction.v1beta1.DutchBiddings, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} returns this
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.clearBiddingsList = function() {
  return this.setBiddingsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 3;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 3));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} returns this
*/
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse} returns this
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.auction.v1beta1.QueryDutchBiddingsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 3) != null;
};


