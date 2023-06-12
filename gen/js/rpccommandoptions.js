// source: cosmos/autocli/v1/options.proto
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

goog.provide('proto.cosmos.autocli.v1.RpcCommandOptions');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Map');
goog.require('jspb.Message');
goog.require('proto.cosmos.autocli.v1.FlagOptions');
goog.require('proto.cosmos.autocli.v1.PositionalArgDescriptor');

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
proto.cosmos.autocli.v1.RpcCommandOptions = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.autocli.v1.RpcCommandOptions.repeatedFields_, null);
};
goog.inherits(proto.cosmos.autocli.v1.RpcCommandOptions, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.autocli.v1.RpcCommandOptions.displayName = 'proto.cosmos.autocli.v1.RpcCommandOptions';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.autocli.v1.RpcCommandOptions.repeatedFields_ = [6,7,11];



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
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.autocli.v1.RpcCommandOptions.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.autocli.v1.RpcCommandOptions} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.autocli.v1.RpcCommandOptions.toObject = function(includeInstance, msg) {
  var f, obj = {
    rpcMethod: jspb.Message.getFieldWithDefault(msg, 1, ""),
    use: jspb.Message.getFieldWithDefault(msg, 2, ""),
    pb_long: jspb.Message.getFieldWithDefault(msg, 3, ""),
    pb_short: jspb.Message.getFieldWithDefault(msg, 4, ""),
    example: jspb.Message.getFieldWithDefault(msg, 5, ""),
    aliasList: (f = jspb.Message.getRepeatedField(msg, 6)) == null ? undefined : f,
    suggestForList: (f = jspb.Message.getRepeatedField(msg, 7)) == null ? undefined : f,
    deprecated: jspb.Message.getFieldWithDefault(msg, 8, ""),
    version: jspb.Message.getFieldWithDefault(msg, 9, ""),
    flagOptionsMap: (f = msg.getFlagOptionsMap()) ? f.toObject(includeInstance, proto.cosmos.autocli.v1.FlagOptions.toObject) : [],
    positionalArgsList: jspb.Message.toObjectList(msg.getPositionalArgsList(),
    proto.cosmos.autocli.v1.PositionalArgDescriptor.toObject, includeInstance),
    skip: jspb.Message.getBooleanFieldWithDefault(msg, 12, false)
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
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.autocli.v1.RpcCommandOptions;
  return proto.cosmos.autocli.v1.RpcCommandOptions.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.autocli.v1.RpcCommandOptions} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRpcMethod(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setUse(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setLong(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setShort(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setExample(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.addAlias(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.addSuggestFor(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeprecated(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setVersion(value);
      break;
    case 10:
      var value = msg.getFlagOptionsMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readMessage, proto.cosmos.autocli.v1.FlagOptions.deserializeBinaryFromReader, "", new proto.cosmos.autocli.v1.FlagOptions());
         });
      break;
    case 11:
      var value = new proto.cosmos.autocli.v1.PositionalArgDescriptor;
      reader.readMessage(value,proto.cosmos.autocli.v1.PositionalArgDescriptor.deserializeBinaryFromReader);
      msg.addPositionalArgs(value);
      break;
    case 12:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setSkip(value);
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
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.autocli.v1.RpcCommandOptions.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.autocli.v1.RpcCommandOptions} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.autocli.v1.RpcCommandOptions.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRpcMethod();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getUse();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getLong();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getShort();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getExample();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getAliasList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      6,
      f
    );
  }
  f = message.getSuggestForList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      7,
      f
    );
  }
  f = message.getDeprecated();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getVersion();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getFlagOptionsMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(10, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeMessage, proto.cosmos.autocli.v1.FlagOptions.serializeBinaryToWriter);
  }
  f = message.getPositionalArgsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      11,
      f,
      proto.cosmos.autocli.v1.PositionalArgDescriptor.serializeBinaryToWriter
    );
  }
  f = message.getSkip();
  if (f) {
    writer.writeBool(
      12,
      f
    );
  }
};


/**
 * optional string rpc_method = 1;
 * @return {string}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getRpcMethod = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setRpcMethod = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string use = 2;
 * @return {string}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getUse = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setUse = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string long = 3;
 * @return {string}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getLong = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setLong = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string short = 4;
 * @return {string}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getShort = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setShort = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string example = 5;
 * @return {string}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getExample = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setExample = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * repeated string alias = 6;
 * @return {!Array<string>}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getAliasList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 6));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setAliasList = function(value) {
  return jspb.Message.setField(this, 6, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.addAlias = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 6, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.clearAliasList = function() {
  return this.setAliasList([]);
};


/**
 * repeated string suggest_for = 7;
 * @return {!Array<string>}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getSuggestForList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 7));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setSuggestForList = function(value) {
  return jspb.Message.setField(this, 7, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.addSuggestFor = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 7, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.clearSuggestForList = function() {
  return this.setSuggestForList([]);
};


/**
 * optional string deprecated = 8;
 * @return {string}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getDeprecated = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setDeprecated = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string version = 9;
 * @return {string}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * map<string, FlagOptions> flag_options = 10;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!proto.cosmos.autocli.v1.FlagOptions>}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getFlagOptionsMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!proto.cosmos.autocli.v1.FlagOptions>} */ (
      jspb.Message.getMapField(this, 10, opt_noLazyCreate,
      proto.cosmos.autocli.v1.FlagOptions));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.clearFlagOptionsMap = function() {
  this.getFlagOptionsMap().clear();
  return this;
};


/**
 * repeated PositionalArgDescriptor positional_args = 11;
 * @return {!Array<!proto.cosmos.autocli.v1.PositionalArgDescriptor>}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getPositionalArgsList = function() {
  return /** @type{!Array<!proto.cosmos.autocli.v1.PositionalArgDescriptor>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.autocli.v1.PositionalArgDescriptor, 11));
};


/**
 * @param {!Array<!proto.cosmos.autocli.v1.PositionalArgDescriptor>} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
*/
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setPositionalArgsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 11, value);
};


/**
 * @param {!proto.cosmos.autocli.v1.PositionalArgDescriptor=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.autocli.v1.PositionalArgDescriptor}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.addPositionalArgs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 11, opt_value, proto.cosmos.autocli.v1.PositionalArgDescriptor, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.clearPositionalArgsList = function() {
  return this.setPositionalArgsList([]);
};


/**
 * optional bool skip = 12;
 * @return {boolean}
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.getSkip = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 12, false));
};


/**
 * @param {boolean} value
 * @return {!proto.cosmos.autocli.v1.RpcCommandOptions} returns this
 */
proto.cosmos.autocli.v1.RpcCommandOptions.prototype.setSkip = function(value) {
  return jspb.Message.setProto3BooleanField(this, 12, value);
};


