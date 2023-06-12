// source: shentu/oracle/v1alpha1/query.proto
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

goog.provide('proto.shentu.oracle.v1alpha1.QueryResponseRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.shentu.oracle.v1alpha1.QueryResponseRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.shentu.oracle.v1alpha1.QueryResponseRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.oracle.v1alpha1.QueryResponseRequest.displayName = 'proto.shentu.oracle.v1alpha1.QueryResponseRequest';
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
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.oracle.v1alpha1.QueryResponseRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.oracle.v1alpha1.QueryResponseRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    contract: jspb.Message.getFieldWithDefault(msg, 1, ""),
    pb_function: jspb.Message.getFieldWithDefault(msg, 2, ""),
    operatorAddress: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.shentu.oracle.v1alpha1.QueryResponseRequest}
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.oracle.v1alpha1.QueryResponseRequest;
  return proto.shentu.oracle.v1alpha1.QueryResponseRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.oracle.v1alpha1.QueryResponseRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.oracle.v1alpha1.QueryResponseRequest}
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContract(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setFunction(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOperatorAddress(value);
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
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.oracle.v1alpha1.QueryResponseRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.oracle.v1alpha1.QueryResponseRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContract();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFunction();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOperatorAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string contract = 1;
 * @return {string}
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.getContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.oracle.v1alpha1.QueryResponseRequest} returns this
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.setContract = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string function = 2;
 * @return {string}
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.getFunction = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.oracle.v1alpha1.QueryResponseRequest} returns this
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.setFunction = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string operator_address = 3;
 * @return {string}
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.getOperatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.oracle.v1alpha1.QueryResponseRequest} returns this
 */
proto.shentu.oracle.v1alpha1.QueryResponseRequest.prototype.setOperatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


