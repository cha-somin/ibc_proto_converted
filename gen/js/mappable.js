// source: assetmantle/splits/mappable/mappable.proto
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

goog.provide('proto.assetmantle.modules.splits.mappable.Mappable');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.types.base.Split');

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
proto.assetmantle.modules.splits.mappable.Mappable = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.modules.splits.mappable.Mappable, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.modules.splits.mappable.Mappable.displayName = 'proto.assetmantle.modules.splits.mappable.Mappable';
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
proto.assetmantle.modules.splits.mappable.Mappable.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.modules.splits.mappable.Mappable.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.modules.splits.mappable.Mappable} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.splits.mappable.Mappable.toObject = function(includeInstance, msg) {
  var f, obj = {
    split: (f = msg.getSplit()) && proto.assetmantle.schema.types.base.Split.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.modules.splits.mappable.Mappable}
 */
proto.assetmantle.modules.splits.mappable.Mappable.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.modules.splits.mappable.Mappable;
  return proto.assetmantle.modules.splits.mappable.Mappable.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.modules.splits.mappable.Mappable} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.modules.splits.mappable.Mappable}
 */
proto.assetmantle.modules.splits.mappable.Mappable.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.schema.types.base.Split;
      reader.readMessage(value,proto.assetmantle.schema.types.base.Split.deserializeBinaryFromReader);
      msg.setSplit(value);
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
proto.assetmantle.modules.splits.mappable.Mappable.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.modules.splits.mappable.Mappable.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.modules.splits.mappable.Mappable} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.splits.mappable.Mappable.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSplit();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.assetmantle.schema.types.base.Split.serializeBinaryToWriter
    );
  }
};


/**
 * optional assetmantle.schema.types.base.Split split = 1;
 * @return {?proto.assetmantle.schema.types.base.Split}
 */
proto.assetmantle.modules.splits.mappable.Mappable.prototype.getSplit = function() {
  return /** @type{?proto.assetmantle.schema.types.base.Split} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.types.base.Split, 1));
};


/**
 * @param {?proto.assetmantle.schema.types.base.Split|undefined} value
 * @return {!proto.assetmantle.modules.splits.mappable.Mappable} returns this
*/
proto.assetmantle.modules.splits.mappable.Mappable.prototype.setSplit = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.splits.mappable.Mappable} returns this
 */
proto.assetmantle.modules.splits.mappable.Mappable.prototype.clearSplit = function() {
  return this.setSplit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.splits.mappable.Mappable.prototype.hasSplit = function() {
  return jspb.Message.getField(this, 1) != null;
};


