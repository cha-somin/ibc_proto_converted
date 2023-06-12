// source: band/bandchain/v1/oracle/proof.proto
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

goog.provide('proto.bandchain.v1.oracle.QueryProofResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.bandchain.v1.oracle.SingleProofResponse');

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
proto.bandchain.v1.oracle.QueryProofResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.bandchain.v1.oracle.QueryProofResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.bandchain.v1.oracle.QueryProofResponse.displayName = 'proto.bandchain.v1.oracle.QueryProofResponse';
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
proto.bandchain.v1.oracle.QueryProofResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.bandchain.v1.oracle.QueryProofResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.bandchain.v1.oracle.QueryProofResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bandchain.v1.oracle.QueryProofResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    height: jspb.Message.getFieldWithDefault(msg, 1, 0),
    result: (f = msg.getResult()) && proto.bandchain.v1.oracle.SingleProofResponse.toObject(includeInstance, f)
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
 * @return {!proto.bandchain.v1.oracle.QueryProofResponse}
 */
proto.bandchain.v1.oracle.QueryProofResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.bandchain.v1.oracle.QueryProofResponse;
  return proto.bandchain.v1.oracle.QueryProofResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.bandchain.v1.oracle.QueryProofResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.bandchain.v1.oracle.QueryProofResponse}
 */
proto.bandchain.v1.oracle.QueryProofResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHeight(value);
      break;
    case 2:
      var value = new proto.bandchain.v1.oracle.SingleProofResponse;
      reader.readMessage(value,proto.bandchain.v1.oracle.SingleProofResponse.deserializeBinaryFromReader);
      msg.setResult(value);
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
proto.bandchain.v1.oracle.QueryProofResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.bandchain.v1.oracle.QueryProofResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.bandchain.v1.oracle.QueryProofResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bandchain.v1.oracle.QueryProofResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHeight();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getResult();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.bandchain.v1.oracle.SingleProofResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 height = 1;
 * @return {number}
 */
proto.bandchain.v1.oracle.QueryProofResponse.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.bandchain.v1.oracle.QueryProofResponse} returns this
 */
proto.bandchain.v1.oracle.QueryProofResponse.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional SingleProofResponse result = 2;
 * @return {?proto.bandchain.v1.oracle.SingleProofResponse}
 */
proto.bandchain.v1.oracle.QueryProofResponse.prototype.getResult = function() {
  return /** @type{?proto.bandchain.v1.oracle.SingleProofResponse} */ (
    jspb.Message.getWrapperField(this, proto.bandchain.v1.oracle.SingleProofResponse, 2));
};


/**
 * @param {?proto.bandchain.v1.oracle.SingleProofResponse|undefined} value
 * @return {!proto.bandchain.v1.oracle.QueryProofResponse} returns this
*/
proto.bandchain.v1.oracle.QueryProofResponse.prototype.setResult = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.bandchain.v1.oracle.QueryProofResponse} returns this
 */
proto.bandchain.v1.oracle.QueryProofResponse.prototype.clearResult = function() {
  return this.setResult(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.bandchain.v1.oracle.QueryProofResponse.prototype.hasResult = function() {
  return jspb.Message.getField(this, 2) != null;
};


