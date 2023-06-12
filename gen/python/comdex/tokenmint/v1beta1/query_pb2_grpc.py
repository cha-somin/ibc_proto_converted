# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from comdex.tokenmint.v1beta1 import query_pb2 as comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.QueryAllTokenMintedForAllApps = channel.unary_unary(
                '/comdex.tokenmint.v1beta1.Query/QueryAllTokenMintedForAllApps',
                request_serializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryAllTokenMintedForAllAppsRequest.SerializeToString,
                response_deserializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryAllTokenMintedForAllAppsResponse.FromString,
                )
        self.QueryTokenMintedByApp = channel.unary_unary(
                '/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByApp',
                request_serializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppRequest.SerializeToString,
                response_deserializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppResponse.FromString,
                )
        self.QueryTokenMintedByAppAndAsset = channel.unary_unary(
                '/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByAppAndAsset',
                request_serializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppAndAssetRequest.SerializeToString,
                response_deserializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppAndAssetResponse.FromString,
                )


class QueryServicer(object):
    """Missing associated documentation comment in .proto file."""

    def QueryAllTokenMintedForAllApps(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryTokenMintedByApp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryTokenMintedByAppAndAsset(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'QueryAllTokenMintedForAllApps': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAllTokenMintedForAllApps,
                    request_deserializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryAllTokenMintedForAllAppsRequest.FromString,
                    response_serializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryAllTokenMintedForAllAppsResponse.SerializeToString,
            ),
            'QueryTokenMintedByApp': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryTokenMintedByApp,
                    request_deserializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppRequest.FromString,
                    response_serializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppResponse.SerializeToString,
            ),
            'QueryTokenMintedByAppAndAsset': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryTokenMintedByAppAndAsset,
                    request_deserializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppAndAssetRequest.FromString,
                    response_serializer=comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppAndAssetResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'comdex.tokenmint.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def QueryAllTokenMintedForAllApps(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.tokenmint.v1beta1.Query/QueryAllTokenMintedForAllApps',
            comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryAllTokenMintedForAllAppsRequest.SerializeToString,
            comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryAllTokenMintedForAllAppsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryTokenMintedByApp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByApp',
            comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppRequest.SerializeToString,
            comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryTokenMintedByAppAndAsset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByAppAndAsset',
            comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppAndAssetRequest.SerializeToString,
            comdex_dot_tokenmint_dot_v1beta1_dot_query__pb2.QueryTokenMintedByAppAndAssetResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
