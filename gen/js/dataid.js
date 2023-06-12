// source: assetmantle/ids/base/data_id.proto
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

goog.provide('proto.assetmantle.schema.ids.base.DataID');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.ids.base.HashID');
goog.require('proto.assetmantle.schema.ids.base.StringID');

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
proto.assetmantle.schema.ids.base.DataID = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.schema.ids.base.DataID, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.schema.ids.base.DataID.displayName = 'proto.assetmantle.schema.ids.base.DataID';
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
proto.assetmantle.schema.ids.base.DataID.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.schema.ids.base.DataID.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.schema.ids.base.DataID} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.ids.base.DataID.toObject = function(includeInstance, msg) {
  var f, obj = {
    typeID: (f = msg.getTypeID()) && proto.assetmantle.schema.ids.base.StringID.toObject(includeInstance, f),
    hashID: (f = msg.getHashID()) && proto.assetmantle.schema.ids.base.HashID.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.schema.ids.base.DataID}
 */
proto.assetmantle.schema.ids.base.DataID.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.schema.ids.base.DataID;
  return proto.assetmantle.schema.ids.base.DataID.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.schema.ids.base.DataID} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.schema.ids.base.DataID}
 */
proto.assetmantle.schema.ids.base.DataID.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.schema.ids.base.StringID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.StringID.deserializeBinaryFromReader);
      msg.setTypeID(value);
      break;
    case 2:
      var value = new proto.assetmantle.schema.ids.base.HashID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.HashID.deserializeBinaryFromReader);
      msg.setHashID(value);
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
proto.assetmantle.schema.ids.base.DataID.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.schema.ids.base.DataID.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.schema.ids.base.DataID} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.ids.base.DataID.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTypeID();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.assetmantle.schema.ids.base.StringID.serializeBinaryToWriter
    );
  }
  f = message.getHashID();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.assetmantle.schema.ids.base.HashID.serializeBinaryToWriter
    );
  }
};


/**
 * optional StringID type_i_d = 1;
 * @return {?proto.assetmantle.schema.ids.base.StringID}
 */
proto.assetmantle.schema.ids.base.DataID.prototype.getTypeID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.StringID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.StringID, 1));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.StringID|undefined} value
 * @return {!proto.assetmantle.schema.ids.base.DataID} returns this
*/
proto.assetmantle.schema.ids.base.DataID.prototype.setTypeID = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.ids.base.DataID} returns this
 */
proto.assetmantle.schema.ids.base.DataID.prototype.clearTypeID = function() {
  return this.setTypeID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.ids.base.DataID.prototype.hasTypeID = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional HashID hash_i_d = 2;
 * @return {?proto.assetmantle.schema.ids.base.HashID}
 */
proto.assetmantle.schema.ids.base.DataID.prototype.getHashID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.HashID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.HashID, 2));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.HashID|undefined} value
 * @return {!proto.assetmantle.schema.ids.base.DataID} returns this
*/
proto.assetmantle.schema.ids.base.DataID.prototype.setHashID = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.ids.base.DataID} returns this
 */
proto.assetmantle.schema.ids.base.DataID.prototype.clearHashID = function() {
  return this.setHashID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.ids.base.DataID.prototype.hasHashID = function() {
  return jspb.Message.getField(this, 2) != null;
};


