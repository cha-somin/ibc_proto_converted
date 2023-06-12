// source: kava/pricefeed/v1beta1/query.proto
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

goog.provide('proto.kava.pricefeed.v1beta1.QueryMarketsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.pricefeed.v1beta1.MarketResponse');

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
proto.kava.pricefeed.v1beta1.QueryMarketsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.pricefeed.v1beta1.QueryMarketsResponse.repeatedFields_, null);
};
goog.inherits(proto.kava.pricefeed.v1beta1.QueryMarketsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.pricefeed.v1beta1.QueryMarketsResponse.displayName = 'proto.kava.pricefeed.v1beta1.QueryMarketsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.repeatedFields_ = [1];



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
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.pricefeed.v1beta1.QueryMarketsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.pricefeed.v1beta1.QueryMarketsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    marketsList: jspb.Message.toObjectList(msg.getMarketsList(),
    proto.kava.pricefeed.v1beta1.MarketResponse.toObject, includeInstance)
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
 * @return {!proto.kava.pricefeed.v1beta1.QueryMarketsResponse}
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.pricefeed.v1beta1.QueryMarketsResponse;
  return proto.kava.pricefeed.v1beta1.QueryMarketsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.pricefeed.v1beta1.QueryMarketsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.pricefeed.v1beta1.QueryMarketsResponse}
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kava.pricefeed.v1beta1.MarketResponse;
      reader.readMessage(value,proto.kava.pricefeed.v1beta1.MarketResponse.deserializeBinaryFromReader);
      msg.addMarkets(value);
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
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.pricefeed.v1beta1.QueryMarketsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.pricefeed.v1beta1.QueryMarketsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMarketsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.kava.pricefeed.v1beta1.MarketResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated MarketResponse markets = 1;
 * @return {!Array<!proto.kava.pricefeed.v1beta1.MarketResponse>}
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.prototype.getMarketsList = function() {
  return /** @type{!Array<!proto.kava.pricefeed.v1beta1.MarketResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.pricefeed.v1beta1.MarketResponse, 1));
};


/**
 * @param {!Array<!proto.kava.pricefeed.v1beta1.MarketResponse>} value
 * @return {!proto.kava.pricefeed.v1beta1.QueryMarketsResponse} returns this
*/
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.prototype.setMarketsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.kava.pricefeed.v1beta1.MarketResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.pricefeed.v1beta1.MarketResponse}
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.prototype.addMarkets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.kava.pricefeed.v1beta1.MarketResponse, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.pricefeed.v1beta1.QueryMarketsResponse} returns this
 */
proto.kava.pricefeed.v1beta1.QueryMarketsResponse.prototype.clearMarketsList = function() {
  return this.setMarketsList([]);
};


