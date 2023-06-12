// source: band/oracle/v1/query.proto
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

goog.provide('proto.oracle.v1.QueryRequestPriceResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.oracle.v1.PriceResult');

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
proto.oracle.v1.QueryRequestPriceResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.oracle.v1.QueryRequestPriceResponse.repeatedFields_, null);
};
goog.inherits(proto.oracle.v1.QueryRequestPriceResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.oracle.v1.QueryRequestPriceResponse.displayName = 'proto.oracle.v1.QueryRequestPriceResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.oracle.v1.QueryRequestPriceResponse.repeatedFields_ = [1];



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
proto.oracle.v1.QueryRequestPriceResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.oracle.v1.QueryRequestPriceResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.oracle.v1.QueryRequestPriceResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.QueryRequestPriceResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    priceResultsList: jspb.Message.toObjectList(msg.getPriceResultsList(),
    proto.oracle.v1.PriceResult.toObject, includeInstance)
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
 * @return {!proto.oracle.v1.QueryRequestPriceResponse}
 */
proto.oracle.v1.QueryRequestPriceResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.oracle.v1.QueryRequestPriceResponse;
  return proto.oracle.v1.QueryRequestPriceResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.oracle.v1.QueryRequestPriceResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.oracle.v1.QueryRequestPriceResponse}
 */
proto.oracle.v1.QueryRequestPriceResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.oracle.v1.PriceResult;
      reader.readMessage(value,proto.oracle.v1.PriceResult.deserializeBinaryFromReader);
      msg.addPriceResults(value);
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
proto.oracle.v1.QueryRequestPriceResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.oracle.v1.QueryRequestPriceResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.oracle.v1.QueryRequestPriceResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.QueryRequestPriceResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPriceResultsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.oracle.v1.PriceResult.serializeBinaryToWriter
    );
  }
};


/**
 * repeated PriceResult price_results = 1;
 * @return {!Array<!proto.oracle.v1.PriceResult>}
 */
proto.oracle.v1.QueryRequestPriceResponse.prototype.getPriceResultsList = function() {
  return /** @type{!Array<!proto.oracle.v1.PriceResult>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.oracle.v1.PriceResult, 1));
};


/**
 * @param {!Array<!proto.oracle.v1.PriceResult>} value
 * @return {!proto.oracle.v1.QueryRequestPriceResponse} returns this
*/
proto.oracle.v1.QueryRequestPriceResponse.prototype.setPriceResultsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.oracle.v1.PriceResult=} opt_value
 * @param {number=} opt_index
 * @return {!proto.oracle.v1.PriceResult}
 */
proto.oracle.v1.QueryRequestPriceResponse.prototype.addPriceResults = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.oracle.v1.PriceResult, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.oracle.v1.QueryRequestPriceResponse} returns this
 */
proto.oracle.v1.QueryRequestPriceResponse.prototype.clearPriceResultsList = function() {
  return this.setPriceResultsList([]);
};


