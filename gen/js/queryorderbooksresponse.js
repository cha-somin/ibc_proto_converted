// source: crescent/liquidity/v1beta1/query.proto
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

goog.provide('proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.liquidity.v1beta1.OrderBookPairResponse');

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
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.repeatedFields_, null);
};
goog.inherits(proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.displayName = 'proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.repeatedFields_ = [2];



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
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    pairsList: jspb.Message.toObjectList(msg.getPairsList(),
    proto.crescent.liquidity.v1beta1.OrderBookPairResponse.toObject, includeInstance)
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
 * @return {!proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse}
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse;
  return proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse}
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 2:
      var value = new proto.crescent.liquidity.v1beta1.OrderBookPairResponse;
      reader.readMessage(value,proto.crescent.liquidity.v1beta1.OrderBookPairResponse.deserializeBinaryFromReader);
      msg.addPairs(value);
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
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPairsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.crescent.liquidity.v1beta1.OrderBookPairResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated OrderBookPairResponse pairs = 2;
 * @return {!Array<!proto.crescent.liquidity.v1beta1.OrderBookPairResponse>}
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.prototype.getPairsList = function() {
  return /** @type{!Array<!proto.crescent.liquidity.v1beta1.OrderBookPairResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.liquidity.v1beta1.OrderBookPairResponse, 2));
};


/**
 * @param {!Array<!proto.crescent.liquidity.v1beta1.OrderBookPairResponse>} value
 * @return {!proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse} returns this
*/
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.prototype.setPairsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.crescent.liquidity.v1beta1.OrderBookPairResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.liquidity.v1beta1.OrderBookPairResponse}
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.prototype.addPairs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.crescent.liquidity.v1beta1.OrderBookPairResponse, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse} returns this
 */
proto.crescent.liquidity.v1beta1.QueryOrderBooksResponse.prototype.clearPairsList = function() {
  return this.setPairsList([]);
};


