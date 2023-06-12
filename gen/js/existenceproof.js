// source: cosmos/ics23/v1/proofs.proto
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

goog.provide('proto.cosmos.ics23.v1.ExistenceProof');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.ics23.v1.InnerOp');
goog.require('proto.cosmos.ics23.v1.LeafOp');

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
proto.cosmos.ics23.v1.ExistenceProof = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.ics23.v1.ExistenceProof.repeatedFields_, null);
};
goog.inherits(proto.cosmos.ics23.v1.ExistenceProof, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.ics23.v1.ExistenceProof.displayName = 'proto.cosmos.ics23.v1.ExistenceProof';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.ics23.v1.ExistenceProof.repeatedFields_ = [4];



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
proto.cosmos.ics23.v1.ExistenceProof.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.ics23.v1.ExistenceProof.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.ics23.v1.ExistenceProof} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.ics23.v1.ExistenceProof.toObject = function(includeInstance, msg) {
  var f, obj = {
    key: msg.getKey_asB64(),
    value: msg.getValue_asB64(),
    leaf: (f = msg.getLeaf()) && proto.cosmos.ics23.v1.LeafOp.toObject(includeInstance, f),
    pathList: jspb.Message.toObjectList(msg.getPathList(),
    proto.cosmos.ics23.v1.InnerOp.toObject, includeInstance)
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
 * @return {!proto.cosmos.ics23.v1.ExistenceProof}
 */
proto.cosmos.ics23.v1.ExistenceProof.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.ics23.v1.ExistenceProof;
  return proto.cosmos.ics23.v1.ExistenceProof.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.ics23.v1.ExistenceProof} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.ics23.v1.ExistenceProof}
 */
proto.cosmos.ics23.v1.ExistenceProof.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setKey(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setValue(value);
      break;
    case 3:
      var value = new proto.cosmos.ics23.v1.LeafOp;
      reader.readMessage(value,proto.cosmos.ics23.v1.LeafOp.deserializeBinaryFromReader);
      msg.setLeaf(value);
      break;
    case 4:
      var value = new proto.cosmos.ics23.v1.InnerOp;
      reader.readMessage(value,proto.cosmos.ics23.v1.InnerOp.deserializeBinaryFromReader);
      msg.addPath(value);
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
proto.cosmos.ics23.v1.ExistenceProof.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.ics23.v1.ExistenceProof.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.ics23.v1.ExistenceProof} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.ics23.v1.ExistenceProof.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getValue_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getLeaf();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.ics23.v1.LeafOp.serializeBinaryToWriter
    );
  }
  f = message.getPathList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.ics23.v1.InnerOp.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes key = 1;
 * @return {string}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes key = 1;
 * This is a type-conversion wrapper around `getKey()`
 * @return {string}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getKey()));
};


/**
 * optional bytes key = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getKey()`
 * @return {!Uint8Array}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.ics23.v1.ExistenceProof} returns this
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.setKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes value = 2;
 * @return {string}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes value = 2;
 * This is a type-conversion wrapper around `getValue()`
 * @return {string}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getValue_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getValue()));
};


/**
 * optional bytes value = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getValue()`
 * @return {!Uint8Array}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getValue_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getValue()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.ics23.v1.ExistenceProof} returns this
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.setValue = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional LeafOp leaf = 3;
 * @return {?proto.cosmos.ics23.v1.LeafOp}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getLeaf = function() {
  return /** @type{?proto.cosmos.ics23.v1.LeafOp} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.ics23.v1.LeafOp, 3));
};


/**
 * @param {?proto.cosmos.ics23.v1.LeafOp|undefined} value
 * @return {!proto.cosmos.ics23.v1.ExistenceProof} returns this
*/
proto.cosmos.ics23.v1.ExistenceProof.prototype.setLeaf = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.ics23.v1.ExistenceProof} returns this
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.clearLeaf = function() {
  return this.setLeaf(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.hasLeaf = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated InnerOp path = 4;
 * @return {!Array<!proto.cosmos.ics23.v1.InnerOp>}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.getPathList = function() {
  return /** @type{!Array<!proto.cosmos.ics23.v1.InnerOp>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.ics23.v1.InnerOp, 4));
};


/**
 * @param {!Array<!proto.cosmos.ics23.v1.InnerOp>} value
 * @return {!proto.cosmos.ics23.v1.ExistenceProof} returns this
*/
proto.cosmos.ics23.v1.ExistenceProof.prototype.setPathList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.ics23.v1.InnerOp=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.ics23.v1.InnerOp}
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.addPath = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.ics23.v1.InnerOp, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.ics23.v1.ExistenceProof} returns this
 */
proto.cosmos.ics23.v1.ExistenceProof.prototype.clearPathList = function() {
  return this.setPathList([]);
};


