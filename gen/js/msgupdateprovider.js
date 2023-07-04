// source: akash/provider/v1beta3/provider.proto
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

goog.provide('proto.akash.provider.v1beta3.MsgUpdateProvider');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.base.v1beta3.Attribute');
goog.require('proto.akash.provider.v1beta3.ProviderInfo');

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
proto.akash.provider.v1beta3.MsgUpdateProvider = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.akash.provider.v1beta3.MsgUpdateProvider.repeatedFields_, null);
};
goog.inherits(proto.akash.provider.v1beta3.MsgUpdateProvider, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.provider.v1beta3.MsgUpdateProvider.displayName = 'proto.akash.provider.v1beta3.MsgUpdateProvider';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.repeatedFields_ = [3];



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
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.provider.v1beta3.MsgUpdateProvider.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.provider.v1beta3.MsgUpdateProvider} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: jspb.Message.getFieldWithDefault(msg, 1, ""),
    hostUri: jspb.Message.getFieldWithDefault(msg, 2, ""),
    attributesList: jspb.Message.toObjectList(msg.getAttributesList(),
    proto.akash.base.v1beta3.Attribute.toObject, includeInstance),
    info: (f = msg.getInfo()) && proto.akash.provider.v1beta3.ProviderInfo.toObject(includeInstance, f)
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
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.provider.v1beta3.MsgUpdateProvider;
  return proto.akash.provider.v1beta3.MsgUpdateProvider.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.provider.v1beta3.MsgUpdateProvider} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostUri(value);
      break;
    case 3:
      var value = new proto.akash.base.v1beta3.Attribute;
      reader.readMessage(value,proto.akash.base.v1beta3.Attribute.deserializeBinaryFromReader);
      msg.addAttributes(value);
      break;
    case 4:
      var value = new proto.akash.provider.v1beta3.ProviderInfo;
      reader.readMessage(value,proto.akash.provider.v1beta3.ProviderInfo.deserializeBinaryFromReader);
      msg.setInfo(value);
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
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.provider.v1beta3.MsgUpdateProvider.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.provider.v1beta3.MsgUpdateProvider} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getHostUri();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAttributesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.akash.base.v1beta3.Attribute.serializeBinaryToWriter
    );
  }
  f = message.getInfo();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.akash.provider.v1beta3.ProviderInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional string owner = 1;
 * @return {string}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider} returns this
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string host_uri = 2;
 * @return {string}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.getHostUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider} returns this
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.setHostUri = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated akash.base.v1beta3.Attribute attributes = 3;
 * @return {!Array<!proto.akash.base.v1beta3.Attribute>}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.getAttributesList = function() {
  return /** @type{!Array<!proto.akash.base.v1beta3.Attribute>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.base.v1beta3.Attribute, 3));
};


/**
 * @param {!Array<!proto.akash.base.v1beta3.Attribute>} value
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider} returns this
*/
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.setAttributesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.akash.base.v1beta3.Attribute=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.base.v1beta3.Attribute}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.addAttributes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.akash.base.v1beta3.Attribute, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider} returns this
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.clearAttributesList = function() {
  return this.setAttributesList([]);
};


/**
 * optional ProviderInfo info = 4;
 * @return {?proto.akash.provider.v1beta3.ProviderInfo}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.getInfo = function() {
  return /** @type{?proto.akash.provider.v1beta3.ProviderInfo} */ (
    jspb.Message.getWrapperField(this, proto.akash.provider.v1beta3.ProviderInfo, 4));
};


/**
 * @param {?proto.akash.provider.v1beta3.ProviderInfo|undefined} value
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider} returns this
*/
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.setInfo = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.provider.v1beta3.MsgUpdateProvider} returns this
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.clearInfo = function() {
  return this.setInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.provider.v1beta3.MsgUpdateProvider.prototype.hasInfo = function() {
  return jspb.Message.getField(this, 4) != null;
};

