// source: injective/oracle/v1beta1/query.proto
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

goog.provide('proto.injective.oracle.v1beta1.QueryOraclePriceResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.oracle.v1beta1.PricePairState');

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
proto.injective.oracle.v1beta1.QueryOraclePriceResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.oracle.v1beta1.QueryOraclePriceResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.oracle.v1beta1.QueryOraclePriceResponse.displayName = 'proto.injective.oracle.v1beta1.QueryOraclePriceResponse';
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
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.oracle.v1beta1.QueryOraclePriceResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.oracle.v1beta1.QueryOraclePriceResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    pricePairState: (f = msg.getPricePairState()) && proto.injective.oracle.v1beta1.PricePairState.toObject(includeInstance, f)
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
 * @return {!proto.injective.oracle.v1beta1.QueryOraclePriceResponse}
 */
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.oracle.v1beta1.QueryOraclePriceResponse;
  return proto.injective.oracle.v1beta1.QueryOraclePriceResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.oracle.v1beta1.QueryOraclePriceResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.oracle.v1beta1.QueryOraclePriceResponse}
 */
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.oracle.v1beta1.PricePairState;
      reader.readMessage(value,proto.injective.oracle.v1beta1.PricePairState.deserializeBinaryFromReader);
      msg.setPricePairState(value);
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
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.oracle.v1beta1.QueryOraclePriceResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.oracle.v1beta1.QueryOraclePriceResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPricePairState();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.injective.oracle.v1beta1.PricePairState.serializeBinaryToWriter
    );
  }
};


/**
 * optional PricePairState price_pair_state = 1;
 * @return {?proto.injective.oracle.v1beta1.PricePairState}
 */
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.prototype.getPricePairState = function() {
  return /** @type{?proto.injective.oracle.v1beta1.PricePairState} */ (
    jspb.Message.getWrapperField(this, proto.injective.oracle.v1beta1.PricePairState, 1));
};


/**
 * @param {?proto.injective.oracle.v1beta1.PricePairState|undefined} value
 * @return {!proto.injective.oracle.v1beta1.QueryOraclePriceResponse} returns this
*/
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.prototype.setPricePairState = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.oracle.v1beta1.QueryOraclePriceResponse} returns this
 */
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.prototype.clearPricePairState = function() {
  return this.setPricePairState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.oracle.v1beta1.QueryOraclePriceResponse.prototype.hasPricePairState = function() {
  return jspb.Message.getField(this, 1) != null;
};


