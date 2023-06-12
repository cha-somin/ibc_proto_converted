// source: sommelier/cork/v2/proposal.proto
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

goog.provide('proto.cork.v2.AddManagedCellarIDsProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cork.v2.CellarIDSet');

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
proto.cork.v2.AddManagedCellarIDsProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cork.v2.AddManagedCellarIDsProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cork.v2.AddManagedCellarIDsProposal.displayName = 'proto.cork.v2.AddManagedCellarIDsProposal';
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
proto.cork.v2.AddManagedCellarIDsProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.cork.v2.AddManagedCellarIDsProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cork.v2.AddManagedCellarIDsProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cork.v2.AddManagedCellarIDsProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    cellarIds: (f = msg.getCellarIds()) && proto.cork.v2.CellarIDSet.toObject(includeInstance, f)
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
 * @return {!proto.cork.v2.AddManagedCellarIDsProposal}
 */
proto.cork.v2.AddManagedCellarIDsProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cork.v2.AddManagedCellarIDsProposal;
  return proto.cork.v2.AddManagedCellarIDsProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cork.v2.AddManagedCellarIDsProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cork.v2.AddManagedCellarIDsProposal}
 */
proto.cork.v2.AddManagedCellarIDsProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.cork.v2.CellarIDSet;
      reader.readMessage(value,proto.cork.v2.CellarIDSet.deserializeBinaryFromReader);
      msg.setCellarIds(value);
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
proto.cork.v2.AddManagedCellarIDsProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cork.v2.AddManagedCellarIDsProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cork.v2.AddManagedCellarIDsProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cork.v2.AddManagedCellarIDsProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getCellarIds();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cork.v2.CellarIDSet.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.cork.v2.AddManagedCellarIDsProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cork.v2.AddManagedCellarIDsProposal} returns this
 */
proto.cork.v2.AddManagedCellarIDsProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.cork.v2.AddManagedCellarIDsProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cork.v2.AddManagedCellarIDsProposal} returns this
 */
proto.cork.v2.AddManagedCellarIDsProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional CellarIDSet cellar_ids = 3;
 * @return {?proto.cork.v2.CellarIDSet}
 */
proto.cork.v2.AddManagedCellarIDsProposal.prototype.getCellarIds = function() {
  return /** @type{?proto.cork.v2.CellarIDSet} */ (
    jspb.Message.getWrapperField(this, proto.cork.v2.CellarIDSet, 3));
};


/**
 * @param {?proto.cork.v2.CellarIDSet|undefined} value
 * @return {!proto.cork.v2.AddManagedCellarIDsProposal} returns this
*/
proto.cork.v2.AddManagedCellarIDsProposal.prototype.setCellarIds = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cork.v2.AddManagedCellarIDsProposal} returns this
 */
proto.cork.v2.AddManagedCellarIDsProposal.prototype.clearCellarIds = function() {
  return this.setCellarIds(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cork.v2.AddManagedCellarIDsProposal.prototype.hasCellarIds = function() {
  return jspb.Message.getField(this, 3) != null;
};


