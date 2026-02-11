# JAVA SDKs for Criteo API

## Introduction
API Client Libraries can facilitate your use of the [Criteo API](https://developers.criteo.com/) allowing you to build unique and customized solutions to serve your businesses and clients.
These libraries can reduce the amount of code you need to write in order to start accessing Criteo programmatically. They also can help expedite troubleshooting, should you encounter any issues.

API clients are generated for each support API version and service. You can find each currently up-to-date SDKs in the **/sdks** folders. You will find specific instructions on how to build each SDKs if you wish to do so yourself.

## MavenCentral artefacts
Each of the generated SDKs is also published on Maven Central
* https://central.sonatype.com/artifact/com.criteo/criteo-api-retailmedia-sdk
* https://central.sonatype.com/artifact/com.criteo/criteo-api-marketingsolutions-sdk
* https://central.sonatype.com/artifact/com.criteo/criteo-api-commercegrid-sdk

The version number contains the API version in its first two digits: 
* the API version **2021-10** translates to version 2021.10.\*.\* of the artefact
* the API version **preview** version translates to version 0.0.\*.\* of the artefact

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.criteo</groupId>
    <artifactId>criteo-api-marketingsolutions-sdk</artifactId>
    <version></version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.criteo:criteo-api-marketingsolutions-sdk:"
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Disclaimer

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
