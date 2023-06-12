// source: panacea/oracle/v2alpha1/query.proto
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

goog.provide('proto.panacea.oracle.v2alpha1.QueryOracleResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.panacea.oracle.v2alpha1.Oracle');

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
proto.panacea.oracle.v2alpha1.QueryOracleResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.oracle.v2alpha1.QueryOracleResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.oracle.v2alpha1.QueryOracleResponse.displayName = 'proto.panacea.oracle.v2alpha1.QueryOracleResponse';
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
proto.panacea.oracle.v2alpha1.QueryOracleResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.oracle.v2alpha1.QueryOracleResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.oracle.v2alpha1.QueryOracleResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.oracle.v2alpha1.QueryOracleResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    oracle: (f = msg.getOracle()) && proto.panacea.oracle.v2alpha1.Oracle.toObject(includeInstance, f)
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
 * @return {!proto.panacea.oracle.v2alpha1.QueryOracleResponse}
 */
proto.panacea.oracle.v2alpha1.QueryOracleResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.oracle.v2alpha1.QueryOracleResponse;
  return proto.panacea.oracle.v2alpha1.QueryOracleResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.oracle.v2alpha1.QueryOracleResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.oracle.v2alpha1.QueryOracleResponse}
 */
proto.panacea.oracle.v2alpha1.QueryOracleResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.panacea.oracle.v2alpha1.Oracle;
      reader.readMessage(value,proto.panacea.oracle.v2alpha1.Oracle.deserializeBinaryFromReader);
      msg.setOracle(value);
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
proto.panacea.oracle.v2alpha1.QueryOracleResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.oracle.v2alpha1.QueryOracleResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.oracle.v2alpha1.QueryOracleResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.oracle.v2alpha1.QueryOracleResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOracle();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.panacea.oracle.v2alpha1.Oracle.serializeBinaryToWriter
    );
  }
};


/**
 * optional Oracle oracle = 1;
 * @return {?proto.panacea.oracle.v2alpha1.Oracle}
 */
proto.panacea.oracle.v2alpha1.QueryOracleResponse.prototype.getOracle = function() {
  return /** @type{?proto.panacea.oracle.v2alpha1.Oracle} */ (
    jspb.Message.getWrapperField(this, proto.panacea.oracle.v2alpha1.Oracle, 1));
};


/**
 * @param {?proto.panacea.oracle.v2alpha1.Oracle|undefined} value
 * @return {!proto.panacea.oracle.v2alpha1.QueryOracleResponse} returns this
*/
proto.panacea.oracle.v2alpha1.QueryOracleResponse.prototype.setOracle = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.oracle.v2alpha1.QueryOracleResponse} returns this
 */
proto.panacea.oracle.v2alpha1.QueryOracleResponse.prototype.clearOracle = function() {
  return this.setOracle(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.oracle.v2alpha1.QueryOracleResponse.prototype.hasOracle = function() {
  return jspb.Message.getField(this, 1) != null;
};


