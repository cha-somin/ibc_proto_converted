// source: assetmantle/classifications/key/key.proto
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

goog.provide('proto.assetmantle.modules.classifications.key.Key');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.ids.base.ClassificationID');

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
proto.assetmantle.modules.classifications.key.Key = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.modules.classifications.key.Key, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.modules.classifications.key.Key.displayName = 'proto.assetmantle.modules.classifications.key.Key';
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
proto.assetmantle.modules.classifications.key.Key.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.modules.classifications.key.Key.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.modules.classifications.key.Key} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.classifications.key.Key.toObject = function(includeInstance, msg) {
  var f, obj = {
    classificationID: (f = msg.getClassificationID()) && proto.assetmantle.schema.ids.base.ClassificationID.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.modules.classifications.key.Key}
 */
proto.assetmantle.modules.classifications.key.Key.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.modules.classifications.key.Key;
  return proto.assetmantle.modules.classifications.key.Key.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.modules.classifications.key.Key} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.modules.classifications.key.Key}
 */
proto.assetmantle.modules.classifications.key.Key.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.schema.ids.base.ClassificationID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.ClassificationID.deserializeBinaryFromReader);
      msg.setClassificationID(value);
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
proto.assetmantle.modules.classifications.key.Key.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.modules.classifications.key.Key.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.modules.classifications.key.Key} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.classifications.key.Key.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClassificationID();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.assetmantle.schema.ids.base.ClassificationID.serializeBinaryToWriter
    );
  }
};


/**
 * optional assetmantle.schema.ids.base.ClassificationID classification_i_d = 1;
 * @return {?proto.assetmantle.schema.ids.base.ClassificationID}
 */
proto.assetmantle.modules.classifications.key.Key.prototype.getClassificationID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.ClassificationID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.ClassificationID, 1));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.ClassificationID|undefined} value
 * @return {!proto.assetmantle.modules.classifications.key.Key} returns this
*/
proto.assetmantle.modules.classifications.key.Key.prototype.setClassificationID = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.classifications.key.Key} returns this
 */
proto.assetmantle.modules.classifications.key.Key.prototype.clearClassificationID = function() {
  return this.setClassificationID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.classifications.key.Key.prototype.hasClassificationID = function() {
  return jspb.Message.getField(this, 1) != null;
};


