# OpenAPIOktaIPRanges

OpenAPI specification and a set of generated API clients for Okta IP Ranges

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `open_api_okta_ip_ranges` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:open_api_okta_ip_ranges, "~> 1.0.0"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/open_api_okta_ip_ranges][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :open_api_okta_ip_ranges, base_url: "https://s3.amazonaws.com/okta-ip-ranges"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`OpenAPIOktaIPRanges.Connection.new/1`:

```elixir
client = OpenAPIOktaIPRanges.Connection.new(base_url: "https://s3.amazonaws.com/okta-ip-ranges")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/open_api_okta_ip_ranges
