// source: injective/exchange/v1beta1/query.proto
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

goog.provide('proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.BalanceMismatch');

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
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.displayName = 'proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.repeatedFields_ = [1];



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
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    balanceMismatchesList: jspb.Message.toObjectList(msg.getBalanceMismatchesList(),
    proto.injective.exchange.v1beta1.BalanceMismatch.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse}
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse;
  return proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse}
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.exchange.v1beta1.BalanceMismatch;
      reader.readMessage(value,proto.injective.exchange.v1beta1.BalanceMismatch.deserializeBinaryFromReader);
      msg.addBalanceMismatches(value);
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
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBalanceMismatchesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.injective.exchange.v1beta1.BalanceMismatch.serializeBinaryToWriter
    );
  }
};


/**
 * repeated BalanceMismatch balance_mismatches = 1;
 * @return {!Array<!proto.injective.exchange.v1beta1.BalanceMismatch>}
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.prototype.getBalanceMismatchesList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.BalanceMismatch>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.BalanceMismatch, 1));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.BalanceMismatch>} value
 * @return {!proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse} returns this
*/
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.prototype.setBalanceMismatchesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.BalanceMismatch=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.BalanceMismatch}
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.prototype.addBalanceMismatches = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.injective.exchange.v1beta1.BalanceMismatch, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse} returns this
 */
proto.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.prototype.clearBalanceMismatchesList = function() {
  return this.setBalanceMismatchesList([]);
};


