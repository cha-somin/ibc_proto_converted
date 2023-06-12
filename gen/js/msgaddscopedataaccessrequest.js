// source: provenance/metadata/v1/tx.proto
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

goog.provide('proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.displayName = 'proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.repeatedFields_ = [2,3];



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
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    scopeId: msg.getScopeId_asB64(),
    dataAccessList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    signersList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest}
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest;
  return proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest}
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setScopeId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addDataAccess(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addSigners(value);
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
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getScopeId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getDataAccessList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getSignersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * optional bytes scope_id = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.getScopeId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes scope_id = 1;
 * This is a type-conversion wrapper around `getScopeId()`
 * @return {string}
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.getScopeId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getScopeId()));
};


/**
 * optional bytes scope_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getScopeId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.getScopeId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getScopeId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.setScopeId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * repeated string data_access = 2;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.getDataAccessList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.setDataAccessList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.addDataAccess = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.clearDataAccessList = function() {
  return this.setDataAccessList([]);
};


/**
 * repeated string signers = 3;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.getSignersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.setSignersList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.addSigners = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddScopeDataAccessRequest.prototype.clearSignersList = function() {
  return this.setSignersList([]);
};


