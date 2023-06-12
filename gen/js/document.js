// source: assetmantle/documents/base/document.proto
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

goog.provide('proto.assetmantle.schema.documents.base.Document');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.ids.base.ClassificationID');
goog.require('proto.assetmantle.schema.qualified.base.Immutables');
goog.require('proto.assetmantle.schema.qualified.base.Mutables');

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
proto.assetmantle.schema.documents.base.Document = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.schema.documents.base.Document, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.schema.documents.base.Document.displayName = 'proto.assetmantle.schema.documents.base.Document';
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
proto.assetmantle.schema.documents.base.Document.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.schema.documents.base.Document.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.schema.documents.base.Document} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.documents.base.Document.toObject = function(includeInstance, msg) {
  var f, obj = {
    classificationID: (f = msg.getClassificationID()) && proto.assetmantle.schema.ids.base.ClassificationID.toObject(includeInstance, f),
    immutables: (f = msg.getImmutables()) && proto.assetmantle.schema.qualified.base.Immutables.toObject(includeInstance, f),
    mutables: (f = msg.getMutables()) && proto.assetmantle.schema.qualified.base.Mutables.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.schema.documents.base.Document}
 */
proto.assetmantle.schema.documents.base.Document.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.schema.documents.base.Document;
  return proto.assetmantle.schema.documents.base.Document.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.schema.documents.base.Document} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.schema.documents.base.Document}
 */
proto.assetmantle.schema.documents.base.Document.deserializeBinaryFromReader = function(msg, reader) {
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
    case 2:
      var value = new proto.assetmantle.schema.qualified.base.Immutables;
      reader.readMessage(value,proto.assetmantle.schema.qualified.base.Immutables.deserializeBinaryFromReader);
      msg.setImmutables(value);
      break;
    case 3:
      var value = new proto.assetmantle.schema.qualified.base.Mutables;
      reader.readMessage(value,proto.assetmantle.schema.qualified.base.Mutables.deserializeBinaryFromReader);
      msg.setMutables(value);
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
proto.assetmantle.schema.documents.base.Document.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.schema.documents.base.Document.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.schema.documents.base.Document} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.documents.base.Document.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClassificationID();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.assetmantle.schema.ids.base.ClassificationID.serializeBinaryToWriter
    );
  }
  f = message.getImmutables();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.assetmantle.schema.qualified.base.Immutables.serializeBinaryToWriter
    );
  }
  f = message.getMutables();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.assetmantle.schema.qualified.base.Mutables.serializeBinaryToWriter
    );
  }
};


/**
 * optional assetmantle.schema.ids.base.ClassificationID classification_i_d = 1;
 * @return {?proto.assetmantle.schema.ids.base.ClassificationID}
 */
proto.assetmantle.schema.documents.base.Document.prototype.getClassificationID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.ClassificationID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.ClassificationID, 1));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.ClassificationID|undefined} value
 * @return {!proto.assetmantle.schema.documents.base.Document} returns this
*/
proto.assetmantle.schema.documents.base.Document.prototype.setClassificationID = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.documents.base.Document} returns this
 */
proto.assetmantle.schema.documents.base.Document.prototype.clearClassificationID = function() {
  return this.setClassificationID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.documents.base.Document.prototype.hasClassificationID = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional assetmantle.schema.qualified.base.Immutables immutables = 2;
 * @return {?proto.assetmantle.schema.qualified.base.Immutables}
 */
proto.assetmantle.schema.documents.base.Document.prototype.getImmutables = function() {
  return /** @type{?proto.assetmantle.schema.qualified.base.Immutables} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.qualified.base.Immutables, 2));
};


/**
 * @param {?proto.assetmantle.schema.qualified.base.Immutables|undefined} value
 * @return {!proto.assetmantle.schema.documents.base.Document} returns this
*/
proto.assetmantle.schema.documents.base.Document.prototype.setImmutables = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.documents.base.Document} returns this
 */
proto.assetmantle.schema.documents.base.Document.prototype.clearImmutables = function() {
  return this.setImmutables(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.documents.base.Document.prototype.hasImmutables = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional assetmantle.schema.qualified.base.Mutables mutables = 3;
 * @return {?proto.assetmantle.schema.qualified.base.Mutables}
 */
proto.assetmantle.schema.documents.base.Document.prototype.getMutables = function() {
  return /** @type{?proto.assetmantle.schema.qualified.base.Mutables} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.qualified.base.Mutables, 3));
};


/**
 * @param {?proto.assetmantle.schema.qualified.base.Mutables|undefined} value
 * @return {!proto.assetmantle.schema.documents.base.Document} returns this
*/
proto.assetmantle.schema.documents.base.Document.prototype.setMutables = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.documents.base.Document} returns this
 */
proto.assetmantle.schema.documents.base.Document.prototype.clearMutables = function() {
  return this.setMutables(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.documents.base.Document.prototype.hasMutables = function() {
  return jspb.Message.getField(this, 3) != null;
};


