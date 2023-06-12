// source: akash/deployment/v1beta1/group.proto
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

goog.provide('proto.akash.deployment.v1beta1.MsgCloseGroup');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.deployment.v1beta1.GroupID');

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
proto.akash.deployment.v1beta1.MsgCloseGroup = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.akash.deployment.v1beta1.MsgCloseGroup, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.deployment.v1beta1.MsgCloseGroup.displayName = 'proto.akash.deployment.v1beta1.MsgCloseGroup';
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
proto.akash.deployment.v1beta1.MsgCloseGroup.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.deployment.v1beta1.MsgCloseGroup.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.deployment.v1beta1.MsgCloseGroup} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta1.MsgCloseGroup.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: (f = msg.getId()) && proto.akash.deployment.v1beta1.GroupID.toObject(includeInstance, f)
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
 * @return {!proto.akash.deployment.v1beta1.MsgCloseGroup}
 */
proto.akash.deployment.v1beta1.MsgCloseGroup.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.deployment.v1beta1.MsgCloseGroup;
  return proto.akash.deployment.v1beta1.MsgCloseGroup.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.deployment.v1beta1.MsgCloseGroup} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.deployment.v1beta1.MsgCloseGroup}
 */
proto.akash.deployment.v1beta1.MsgCloseGroup.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.deployment.v1beta1.GroupID;
      reader.readMessage(value,proto.akash.deployment.v1beta1.GroupID.deserializeBinaryFromReader);
      msg.setId(value);
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
proto.akash.deployment.v1beta1.MsgCloseGroup.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.deployment.v1beta1.MsgCloseGroup.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.deployment.v1beta1.MsgCloseGroup} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta1.MsgCloseGroup.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.deployment.v1beta1.GroupID.serializeBinaryToWriter
    );
  }
};


/**
 * optional GroupID id = 1;
 * @return {?proto.akash.deployment.v1beta1.GroupID}
 */
proto.akash.deployment.v1beta1.MsgCloseGroup.prototype.getId = function() {
  return /** @type{?proto.akash.deployment.v1beta1.GroupID} */ (
    jspb.Message.getWrapperField(this, proto.akash.deployment.v1beta1.GroupID, 1));
};


/**
 * @param {?proto.akash.deployment.v1beta1.GroupID|undefined} value
 * @return {!proto.akash.deployment.v1beta1.MsgCloseGroup} returns this
*/
proto.akash.deployment.v1beta1.MsgCloseGroup.prototype.setId = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta1.MsgCloseGroup} returns this
 */
proto.akash.deployment.v1beta1.MsgCloseGroup.prototype.clearId = function() {
  return this.setId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta1.MsgCloseGroup.prototype.hasId = function() {
  return jspb.Message.getField(this, 1) != null;
};


