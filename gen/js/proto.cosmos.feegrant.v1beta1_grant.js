// source: cosmos/feegrant/v1beta1/feegrant.proto
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

goog.provide('proto.cosmos.feegrant.v1beta1.Grant');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

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
proto.cosmos.feegrant.v1beta1.Grant = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.feegrant.v1beta1.Grant, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.feegrant.v1beta1.Grant.displayName = 'proto.cosmos.feegrant.v1beta1.Grant';
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
proto.cosmos.feegrant.v1beta1.Grant.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.feegrant.v1beta1.Grant.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.feegrant.v1beta1.Grant} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.feegrant.v1beta1.Grant.toObject = function(includeInstance, msg) {
  var f, obj = {
    granter: jspb.Message.getFieldWithDefault(msg, 1, ""),
    grantee: jspb.Message.getFieldWithDefault(msg, 2, ""),
    allowance: (f = msg.getAllowance()) && proto.google.protobuf.Any.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.feegrant.v1beta1.Grant}
 */
proto.cosmos.feegrant.v1beta1.Grant.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.feegrant.v1beta1.Grant;
  return proto.cosmos.feegrant.v1beta1.Grant.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.feegrant.v1beta1.Grant} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.feegrant.v1beta1.Grant}
 */
proto.cosmos.feegrant.v1beta1.Grant.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setGranter(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setGrantee(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setAllowance(value);
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
proto.cosmos.feegrant.v1beta1.Grant.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.feegrant.v1beta1.Grant.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.feegrant.v1beta1.Grant} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.feegrant.v1beta1.Grant.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGranter();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getGrantee();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAllowance();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * optional string granter = 1;
 * @return {string}
 */
proto.cosmos.feegrant.v1beta1.Grant.prototype.getGranter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.feegrant.v1beta1.Grant} returns this
 */
proto.cosmos.feegrant.v1beta1.Grant.prototype.setGranter = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string grantee = 2;
 * @return {string}
 */
proto.cosmos.feegrant.v1beta1.Grant.prototype.getGrantee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.feegrant.v1beta1.Grant} returns this
 */
proto.cosmos.feegrant.v1beta1.Grant.prototype.setGrantee = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional google.protobuf.Any allowance = 3;
 * @return {?proto.google.protobuf.Any}
 */
proto.cosmos.feegrant.v1beta1.Grant.prototype.getAllowance = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 3));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.cosmos.feegrant.v1beta1.Grant} returns this
*/
proto.cosmos.feegrant.v1beta1.Grant.prototype.setAllowance = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.feegrant.v1beta1.Grant} returns this
 */
proto.cosmos.feegrant.v1beta1.Grant.prototype.clearAllowance = function() {
  return this.setAllowance(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.feegrant.v1beta1.Grant.prototype.hasAllowance = function() {
  return jspb.Message.getField(this, 3) != null;
};


