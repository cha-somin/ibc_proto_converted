// source: assetmantle/metas/mappable/mappable.proto
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

goog.provide('proto.assetmantle.modules.metas.mappable.Mappable');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.data.base.AnyData');

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
proto.assetmantle.modules.metas.mappable.Mappable = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.modules.metas.mappable.Mappable, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.modules.metas.mappable.Mappable.displayName = 'proto.assetmantle.modules.metas.mappable.Mappable';
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
proto.assetmantle.modules.metas.mappable.Mappable.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.modules.metas.mappable.Mappable.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.modules.metas.mappable.Mappable} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.metas.mappable.Mappable.toObject = function(includeInstance, msg) {
  var f, obj = {
    data: (f = msg.getData()) && proto.assetmantle.schema.data.base.AnyData.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.modules.metas.mappable.Mappable}
 */
proto.assetmantle.modules.metas.mappable.Mappable.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.modules.metas.mappable.Mappable;
  return proto.assetmantle.modules.metas.mappable.Mappable.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.modules.metas.mappable.Mappable} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.modules.metas.mappable.Mappable}
 */
proto.assetmantle.modules.metas.mappable.Mappable.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.schema.data.base.AnyData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.AnyData.deserializeBinaryFromReader);
      msg.setData(value);
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
proto.assetmantle.modules.metas.mappable.Mappable.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.modules.metas.mappable.Mappable.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.modules.metas.mappable.Mappable} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.metas.mappable.Mappable.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getData();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.assetmantle.schema.data.base.AnyData.serializeBinaryToWriter
    );
  }
};


/**
 * optional assetmantle.schema.data.base.AnyData data = 1;
 * @return {?proto.assetmantle.schema.data.base.AnyData}
 */
proto.assetmantle.modules.metas.mappable.Mappable.prototype.getData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.AnyData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.AnyData, 1));
};


/**
 * @param {?proto.assetmantle.schema.data.base.AnyData|undefined} value
 * @return {!proto.assetmantle.modules.metas.mappable.Mappable} returns this
*/
proto.assetmantle.modules.metas.mappable.Mappable.prototype.setData = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.metas.mappable.Mappable} returns this
 */
proto.assetmantle.modules.metas.mappable.Mappable.prototype.clearData = function() {
  return this.setData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.metas.mappable.Mappable.prototype.hasData = function() {
  return jspb.Message.getField(this, 1) != null;
};


