// source: ixo/iid/v1beta1/tx.proto
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

goog.provide('proto.ixo.iid.v1beta1.Verification');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.iid.v1beta1.VerificationMethod');

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
proto.ixo.iid.v1beta1.Verification = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.iid.v1beta1.Verification.repeatedFields_, null);
};
goog.inherits(proto.ixo.iid.v1beta1.Verification, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.iid.v1beta1.Verification.displayName = 'proto.ixo.iid.v1beta1.Verification';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.iid.v1beta1.Verification.repeatedFields_ = [1,3];



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
proto.ixo.iid.v1beta1.Verification.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.iid.v1beta1.Verification.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.iid.v1beta1.Verification} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.iid.v1beta1.Verification.toObject = function(includeInstance, msg) {
  var f, obj = {
    relationshipsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    method: (f = msg.getMethod()) && proto.ixo.iid.v1beta1.VerificationMethod.toObject(includeInstance, f),
    contextList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.ixo.iid.v1beta1.Verification}
 */
proto.ixo.iid.v1beta1.Verification.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.iid.v1beta1.Verification;
  return proto.ixo.iid.v1beta1.Verification.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.iid.v1beta1.Verification} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.iid.v1beta1.Verification}
 */
proto.ixo.iid.v1beta1.Verification.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addRelationships(value);
      break;
    case 2:
      var value = new proto.ixo.iid.v1beta1.VerificationMethod;
      reader.readMessage(value,proto.ixo.iid.v1beta1.VerificationMethod.deserializeBinaryFromReader);
      msg.setMethod(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addContext(value);
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
proto.ixo.iid.v1beta1.Verification.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.iid.v1beta1.Verification.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.iid.v1beta1.Verification} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.iid.v1beta1.Verification.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRelationshipsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getMethod();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.ixo.iid.v1beta1.VerificationMethod.serializeBinaryToWriter
    );
  }
  f = message.getContextList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * repeated string relationships = 1;
 * @return {!Array<string>}
 */
proto.ixo.iid.v1beta1.Verification.prototype.getRelationshipsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
 */
proto.ixo.iid.v1beta1.Verification.prototype.setRelationshipsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
 */
proto.ixo.iid.v1beta1.Verification.prototype.addRelationships = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
 */
proto.ixo.iid.v1beta1.Verification.prototype.clearRelationshipsList = function() {
  return this.setRelationshipsList([]);
};


/**
 * optional VerificationMethod method = 2;
 * @return {?proto.ixo.iid.v1beta1.VerificationMethod}
 */
proto.ixo.iid.v1beta1.Verification.prototype.getMethod = function() {
  return /** @type{?proto.ixo.iid.v1beta1.VerificationMethod} */ (
    jspb.Message.getWrapperField(this, proto.ixo.iid.v1beta1.VerificationMethod, 2));
};


/**
 * @param {?proto.ixo.iid.v1beta1.VerificationMethod|undefined} value
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
*/
proto.ixo.iid.v1beta1.Verification.prototype.setMethod = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
 */
proto.ixo.iid.v1beta1.Verification.prototype.clearMethod = function() {
  return this.setMethod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.iid.v1beta1.Verification.prototype.hasMethod = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated string context = 3;
 * @return {!Array<string>}
 */
proto.ixo.iid.v1beta1.Verification.prototype.getContextList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
 */
proto.ixo.iid.v1beta1.Verification.prototype.setContextList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
 */
proto.ixo.iid.v1beta1.Verification.prototype.addContext = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.iid.v1beta1.Verification} returns this
 */
proto.ixo.iid.v1beta1.Verification.prototype.clearContextList = function() {
  return this.setContextList([]);
};


