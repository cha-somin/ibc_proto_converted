// source: gravity/v1/query.proto
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

goog.provide('proto.gravity.v1.QueryValsetConfirmResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gravity.v1.MsgValsetConfirm');

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
proto.gravity.v1.QueryValsetConfirmResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.gravity.v1.QueryValsetConfirmResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gravity.v1.QueryValsetConfirmResponse.displayName = 'proto.gravity.v1.QueryValsetConfirmResponse';
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
proto.gravity.v1.QueryValsetConfirmResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.gravity.v1.QueryValsetConfirmResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gravity.v1.QueryValsetConfirmResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.QueryValsetConfirmResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    confirm: (f = msg.getConfirm()) && proto.gravity.v1.MsgValsetConfirm.toObject(includeInstance, f)
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
 * @return {!proto.gravity.v1.QueryValsetConfirmResponse}
 */
proto.gravity.v1.QueryValsetConfirmResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gravity.v1.QueryValsetConfirmResponse;
  return proto.gravity.v1.QueryValsetConfirmResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gravity.v1.QueryValsetConfirmResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gravity.v1.QueryValsetConfirmResponse}
 */
proto.gravity.v1.QueryValsetConfirmResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.gravity.v1.MsgValsetConfirm;
      reader.readMessage(value,proto.gravity.v1.MsgValsetConfirm.deserializeBinaryFromReader);
      msg.setConfirm(value);
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
proto.gravity.v1.QueryValsetConfirmResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gravity.v1.QueryValsetConfirmResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gravity.v1.QueryValsetConfirmResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.QueryValsetConfirmResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConfirm();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.gravity.v1.MsgValsetConfirm.serializeBinaryToWriter
    );
  }
};


/**
 * optional MsgValsetConfirm confirm = 1;
 * @return {?proto.gravity.v1.MsgValsetConfirm}
 */
proto.gravity.v1.QueryValsetConfirmResponse.prototype.getConfirm = function() {
  return /** @type{?proto.gravity.v1.MsgValsetConfirm} */ (
    jspb.Message.getWrapperField(this, proto.gravity.v1.MsgValsetConfirm, 1));
};


/**
 * @param {?proto.gravity.v1.MsgValsetConfirm|undefined} value
 * @return {!proto.gravity.v1.QueryValsetConfirmResponse} returns this
*/
proto.gravity.v1.QueryValsetConfirmResponse.prototype.setConfirm = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gravity.v1.QueryValsetConfirmResponse} returns this
 */
proto.gravity.v1.QueryValsetConfirmResponse.prototype.clearConfirm = function() {
  return this.setConfirm(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gravity.v1.QueryValsetConfirmResponse.prototype.hasConfirm = function() {
  return jspb.Message.getField(this, 1) != null;
};


