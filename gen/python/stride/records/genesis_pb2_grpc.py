# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc



class MsgStub(object):
    """Msg defines the Msg service.
    this line is used by starport scaffolding # proto/tx/rpc
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """


class MsgServicer(object):
    """Msg defines the Msg service.
    this line is used by starport scaffolding # proto/tx/rpc
    """


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stride.records.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    this line is used by starport scaffolding # proto/tx/rpc
    """
