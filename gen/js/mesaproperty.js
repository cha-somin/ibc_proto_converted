// source: assetmantle/properties/base/mesa_property.proto
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

goog.provide('proto.assetmantle.schema.properties.base.MesaProperty');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.ids.base.DataID');
goog.require('proto.assetmantle.schema.ids.base.PropertyID');

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
proto.assetmantle.schema.properties.base.MesaProperty = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.schema.properties.base.MesaProperty, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.schema.properties.base.MesaProperty.displayName = 'proto.assetmantle.schema.properties.base.MesaProperty';
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
proto.assetmantle.schema.properties.base.MesaProperty.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.schema.properties.base.MesaProperty.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.schema.properties.base.MesaProperty} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.properties.base.MesaProperty.toObject = function(includeInstance, msg) {
  var f, obj = {
    iD: (f = msg.getID()) && proto.assetmantle.schema.ids.base.PropertyID.toObject(includeInstance, f),
    dataID: (f = msg.getDataID()) && proto.assetmantle.schema.ids.base.DataID.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.schema.properties.base.MesaProperty}
 */
proto.assetmantle.schema.properties.base.MesaProperty.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.schema.properties.base.MesaProperty;
  return proto.assetmantle.schema.properties.base.MesaProperty.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.schema.properties.base.MesaProperty} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.schema.properties.base.MesaProperty}
 */
proto.assetmantle.schema.properties.base.MesaProperty.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.schema.ids.base.PropertyID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.PropertyID.deserializeBinaryFromReader);
      msg.setID(value);
      break;
    case 2:
      var value = new proto.assetmantle.schema.ids.base.DataID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.DataID.deserializeBinaryFromReader);
      msg.setDataID(value);
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
proto.assetmantle.schema.properties.base.MesaProperty.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.schema.properties.base.MesaProperty.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.schema.properties.base.MesaProperty} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.properties.base.MesaProperty.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getID();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.assetmantle.schema.ids.base.PropertyID.serializeBinaryToWriter
    );
  }
  f = message.getDataID();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.assetmantle.schema.ids.base.DataID.serializeBinaryToWriter
    );
  }
};


/**
 * optional assetmantle.schema.ids.base.PropertyID i_d = 1;
 * @return {?proto.assetmantle.schema.ids.base.PropertyID}
 */
proto.assetmantle.schema.properties.base.MesaProperty.prototype.getID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.PropertyID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.PropertyID, 1));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.PropertyID|undefined} value
 * @return {!proto.assetmantle.schema.properties.base.MesaProperty} returns this
*/
proto.assetmantle.schema.properties.base.MesaProperty.prototype.setID = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.properties.base.MesaProperty} returns this
 */
proto.assetmantle.schema.properties.base.MesaProperty.prototype.clearID = function() {
  return this.setID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.properties.base.MesaProperty.prototype.hasID = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional assetmantle.schema.ids.base.DataID data_i_d = 2;
 * @return {?proto.assetmantle.schema.ids.base.DataID}
 */
proto.assetmantle.schema.properties.base.MesaProperty.prototype.getDataID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.DataID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.DataID, 2));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.DataID|undefined} value
 * @return {!proto.assetmantle.schema.properties.base.MesaProperty} returns this
*/
proto.assetmantle.schema.properties.base.MesaProperty.prototype.setDataID = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.properties.base.MesaProperty} returns this
 */
proto.assetmantle.schema.properties.base.MesaProperty.prototype.clearDataID = function() {
  return this.setDataID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.properties.base.MesaProperty.prototype.hasDataID = function() {
  return jspb.Message.getField(this, 2) != null;
};

