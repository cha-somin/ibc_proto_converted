// source: osmosis/superfluid/v1beta1/gov.proto
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

goog.provide('proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal');

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
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.repeatedFields_, null);
};
goog.inherits(proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.displayName = 'proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.repeatedFields_ = [3];



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
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    idsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    isOverwrite: jspb.Message.getBooleanFieldWithDefault(msg, 4, false)
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
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal}
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal;
  return proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal}
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addIds(values[i]);
      }
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsOverwrite(value);
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
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getIdsList();
  if (f.length > 0) {
    writer.writePackedUint64(
      3,
      f
    );
  }
  f = message.getIsOverwrite();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} returns this
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} returns this
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated uint64 ids = 3;
 * @return {!Array<number>}
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.getIdsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} returns this
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.setIdsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} returns this
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.addIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} returns this
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.clearIdsList = function() {
  return this.setIdsList([]);
};


/**
 * optional bool is_overwrite = 4;
 * @return {boolean}
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.getIsOverwrite = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal} returns this
 */
proto.osmosis.superfluid.v1beta1.UpdateUnpoolWhiteListProposal.prototype.setIsOverwrite = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};

