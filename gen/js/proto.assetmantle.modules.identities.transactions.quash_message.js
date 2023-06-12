// source: assetmantle/identities/transactions/quash/message.proto
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

goog.provide('proto.assetmantle.modules.identities.transactions.quash.Message');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.ids.base.IdentityID');

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
proto.assetmantle.modules.identities.transactions.quash.Message = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.modules.identities.transactions.quash.Message, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.modules.identities.transactions.quash.Message.displayName = 'proto.assetmantle.modules.identities.transactions.quash.Message';
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
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.modules.identities.transactions.quash.Message.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.modules.identities.transactions.quash.Message} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.identities.transactions.quash.Message.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    fromID: (f = msg.getFromID()) && proto.assetmantle.schema.ids.base.IdentityID.toObject(includeInstance, f),
    identityID: (f = msg.getIdentityID()) && proto.assetmantle.schema.ids.base.IdentityID.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.modules.identities.transactions.quash.Message}
 */
proto.assetmantle.modules.identities.transactions.quash.Message.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.modules.identities.transactions.quash.Message;
  return proto.assetmantle.modules.identities.transactions.quash.Message.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.modules.identities.transactions.quash.Message} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.modules.identities.transactions.quash.Message}
 */
proto.assetmantle.modules.identities.transactions.quash.Message.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = new proto.assetmantle.schema.ids.base.IdentityID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.IdentityID.deserializeBinaryFromReader);
      msg.setFromID(value);
      break;
    case 3:
      var value = new proto.assetmantle.schema.ids.base.IdentityID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.IdentityID.deserializeBinaryFromReader);
      msg.setIdentityID(value);
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
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.modules.identities.transactions.quash.Message.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.modules.identities.transactions.quash.Message} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.identities.transactions.quash.Message.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFromID();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.assetmantle.schema.ids.base.IdentityID.serializeBinaryToWriter
    );
  }
  f = message.getIdentityID();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.assetmantle.schema.ids.base.IdentityID.serializeBinaryToWriter
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.assetmantle.modules.identities.transactions.quash.Message} returns this
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional assetmantle.schema.ids.base.IdentityID from_i_d = 2;
 * @return {?proto.assetmantle.schema.ids.base.IdentityID}
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.getFromID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.IdentityID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.IdentityID, 2));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.IdentityID|undefined} value
 * @return {!proto.assetmantle.modules.identities.transactions.quash.Message} returns this
*/
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.setFromID = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.identities.transactions.quash.Message} returns this
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.clearFromID = function() {
  return this.setFromID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.hasFromID = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional assetmantle.schema.ids.base.IdentityID identity_i_d = 3;
 * @return {?proto.assetmantle.schema.ids.base.IdentityID}
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.getIdentityID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.IdentityID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.IdentityID, 3));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.IdentityID|undefined} value
 * @return {!proto.assetmantle.modules.identities.transactions.quash.Message} returns this
*/
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.setIdentityID = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.identities.transactions.quash.Message} returns this
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.clearIdentityID = function() {
  return this.setIdentityID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.identities.transactions.quash.Message.prototype.hasIdentityID = function() {
  return jspb.Message.getField(this, 3) != null;
};


