// source: canto/govshuttle/v1/govshuttle.proto
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

goog.provide('proto.canto.govshuttle.v1.TreasuryProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.canto.govshuttle.v1.TreasuryProposalMetadata');

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
proto.canto.govshuttle.v1.TreasuryProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.canto.govshuttle.v1.TreasuryProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.canto.govshuttle.v1.TreasuryProposal.displayName = 'proto.canto.govshuttle.v1.TreasuryProposal';
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
proto.canto.govshuttle.v1.TreasuryProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.canto.govshuttle.v1.TreasuryProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.canto.govshuttle.v1.TreasuryProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.govshuttle.v1.TreasuryProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    metadata: (f = msg.getMetadata()) && proto.canto.govshuttle.v1.TreasuryProposalMetadata.toObject(includeInstance, f)
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
 * @return {!proto.canto.govshuttle.v1.TreasuryProposal}
 */
proto.canto.govshuttle.v1.TreasuryProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.canto.govshuttle.v1.TreasuryProposal;
  return proto.canto.govshuttle.v1.TreasuryProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.canto.govshuttle.v1.TreasuryProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.canto.govshuttle.v1.TreasuryProposal}
 */
proto.canto.govshuttle.v1.TreasuryProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.canto.govshuttle.v1.TreasuryProposalMetadata;
      reader.readMessage(value,proto.canto.govshuttle.v1.TreasuryProposalMetadata.deserializeBinaryFromReader);
      msg.setMetadata(value);
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
proto.canto.govshuttle.v1.TreasuryProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.canto.govshuttle.v1.TreasuryProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.canto.govshuttle.v1.TreasuryProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.govshuttle.v1.TreasuryProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getMetadata();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.canto.govshuttle.v1.TreasuryProposalMetadata.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.canto.govshuttle.v1.TreasuryProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.canto.govshuttle.v1.TreasuryProposal} returns this
 */
proto.canto.govshuttle.v1.TreasuryProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.canto.govshuttle.v1.TreasuryProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.canto.govshuttle.v1.TreasuryProposal} returns this
 */
proto.canto.govshuttle.v1.TreasuryProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional TreasuryProposalMetadata metadata = 3;
 * @return {?proto.canto.govshuttle.v1.TreasuryProposalMetadata}
 */
proto.canto.govshuttle.v1.TreasuryProposal.prototype.getMetadata = function() {
  return /** @type{?proto.canto.govshuttle.v1.TreasuryProposalMetadata} */ (
    jspb.Message.getWrapperField(this, proto.canto.govshuttle.v1.TreasuryProposalMetadata, 3));
};


/**
 * @param {?proto.canto.govshuttle.v1.TreasuryProposalMetadata|undefined} value
 * @return {!proto.canto.govshuttle.v1.TreasuryProposal} returns this
*/
proto.canto.govshuttle.v1.TreasuryProposal.prototype.setMetadata = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.canto.govshuttle.v1.TreasuryProposal} returns this
 */
proto.canto.govshuttle.v1.TreasuryProposal.prototype.clearMetadata = function() {
  return this.setMetadata(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.canto.govshuttle.v1.TreasuryProposal.prototype.hasMetadata = function() {
  return jspb.Message.getField(this, 3) != null;
};

